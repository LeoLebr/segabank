import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.util.*;
import bo.*;
import dal.*;

public class App {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {

        int response;
        boolean first = true;
        do {
            if (!first) {
                System.out.println("Mauvais choix... merci de recommencer !");
            }
            System.out.println("=========== MENU PRINCIPAL ===========");
            System.out.println("1) Ajouter un nouveau compte ");
            System.out.println("2) Suppression d'un compte existant    ");
            System.out.println("3) Afficher les informations d'un compte  ");
            System.out.println("4) Afficher la liste des agences  ");
            System.out.println("5) Lister les comptes ");
            System.out.println("6) Effectuer un virement ");
            System.out.println("7) Fermer l'application ");
            try {
                response = sc.nextInt();
            } catch (InputMismatchException e) {
                response = -1;
            } finally {
                sc.nextLine();
            }

        } while (response < 1 || response > 7);

        switch (response) {
            case 1:
                nouveauCompte();
                break;
            case 2:
                supprCompte();
                break;
            case 3:
                infoCompte();
                break;
            case 4:
                listeAllAgences();
                break;
            case 5:
                listeComptes();
                break;
            case 6:
                operationVirement();
                break;
            case 7:
                System.out.println("Merci d'avoir utilisé SEGA-Bank !");
                break;
        }
    }

    private static void nouveauCompte throws SQLException,IOException,ClassNotFoundException {
        int response;
        boolean boolMainMenu = true;

        float solde;
        float decouvert;
        float interet;
        int idAgence = 0;
        boolean exist = false;

        do {
            if (!boolMainMenu) {
                System.out.println("Mauvais choix, merci de recommencer");
            }
            System.out.println("======Création d'un nouveau compte======");
            System.out.println("|1 - Simple ?");
            System.out.println("|2 - Epargne ?");
            System.out.println("|3 - Payant ?");
            try {
                response = sc.nextInt();
            } catch (InputMismatchException e) {
                response = -1;
            } finally {
                sc.nextLine();
            }
        } while (response < 1 || response > 3);

        switch (response) {
            case 1:
                CompteSimple compteSimple;
                CompteSimpleDAO compteSimpleDAO;

                System.out.print("Identifiant du nouveau compte : ");
                solde = sc.nextFloat();
                System.out.print("Saisissez le montant du découvert : ");
                decouvert = sc.nextFloat();
                idAgence = sc.nextInt();
                System.out.print("Saisissez l'id de l'agence : ");
                idAgence = sc.nextInt();

                compteSimple = new CompteSimple(solde, decouvert, idAgence);
                compteSimpleDAO = new CompteSimpleDAO();
                compteSimpleDAO.create(compteSimple);
                System.out.println("Nouveau compte simple créé");
                break;
            case 2:
                CompteEpargne compteEpargne;
                CompteEpargneDAO compteEpargneDAO;

                System.out.println("Nouveau compte épargne ...");
                System.out.print("Saisissez le solde de votre nouveau compte : ");
                solde = sc.nextFloat();
                System.out.print("Saisissez le taux d'intérêt de votre nouveau compte : ");
                interet = sc.nextFloat();
                idAgence = sc.nextInt();
                System.out.print("Saisissez l'id de l'agence : ");
                idAgence = sc.nextInt();
                compteEpargne = new CompteEpargne(solde, interet, idAgence);
                compteEpargneDAO = new CompteEpargneDAO();
                compteEpargneDAO.create(compteEpargne);
                System.out.println("Nouveau compte épargne créé");
                break;
            case 3:
                ComptePayant comptePayant;
                ComptePayantDAO comptePayantDAO;

                System.out.println("Nouveau compte payant ...");
                System.out.print("Saisissez le solde de votre nouveau compte : ");
                solde = sc.nextFloat();
                idAgence = sc.nextInt();
                System.out.print("Saisissez l'id de l'agence : ");
                idAgence = sc.nextInt();
                comptePayant = new ComptePayant(solde, idAgence);
                comptePayantDAO = new ComptePayantDAO();
                comptePayantDAO.create(comptePayant);
                System.out.println("Nouveau compte payant créé");
                break;
        }
    }

        private static void supprCompte () throws SQLException, IOException, ClassNotFoundException {
        int id = sc.nextInt();
        System.out.print("Saisir l'id du compte à supprimer : ");
        id = sc.nextInt();

        CompteDAO compte = new CompteDAO();
        int type = compte.getType(id);

        switch (type) {
            case 1:
                CompteEpargneDAO compteEpagneDAO = new CompteEpargneDAO();
                CompteEpargne compteEpargne = compteEpagneDAO.findById(id);

                compteEpagneDAO.remove(compteEpargne);
                System.out.println("Compte Epargne Supprimé !");
                break;
            case 2:
                CompteSimpleDAO compteSimpleDAO = new CompteSimpleDAO();
                CompteSimple compteSimple = compteSimpleDAO.findById(id);

                compteSimpleDAO.remove(compteSimple);
                System.out.println("Compte Simple Supprimé !");
                break;
            case 3:
                ComptePayantDAO comptePayantDAO = new ComptePayantDAO();
                ComptePayant comptePayant = comptePayantDAO.findById(id);

                comptePayantDAO.remove(comptePayant);
                System.out.println("Compte Payant Supprimé !");
                break;
        }
    }

        private static void infoCompte () throws SQLException, IOException, ClassNotFoundException  {

    }

        private static void listeAllAgences () throws SQLException, IOException, ClassNotFoundException {
            AgenceDAO agence = new AgenceDAO();
            List<Agence> list = agence.findAll();

            System.out.println("Liste des Agences enregistrées : ");
            for (Agence a : list) {
                System.out.println(a.toString());
            }
    }

        private static void listeComptes () throws SQLException, IOException, ClassNotFoundException {
            CompteDAO compte = new CompteDAO();
            List<Compte> list = compte.findAll();

            System.out.println("Liste des Agences enregistrées : ");
            for (Compte c : list) {
                System.out.println(c.toString());
            }
        }

        private static void operationVirement () throws SQLException, IOException, ClassNotFoundException {

    }

}