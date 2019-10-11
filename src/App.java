import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.SQLException;
import java.util.*;

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
            System.out.println("2) Administrer un compte existant ");
            System.out.println("3) Administrer un compte existant ");
            System.out.println("4) Administrer un compte existant ");
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
                menuPrincipal();
                break;
            case 2:
                afficherCompte();
                menuPrincipal();
                break;

        }
    }

    private static void nouveauCompte() throws SQLException, IOException, ClassNotFoundException {
        System.out.println("=========== AJOUT D'UN COMPTE ===========");
        System.out.println("Type de compte : ");
        // Solde = 0 par défaut
        System.out.println("1 - Choix 2 ");
    }

    private static void afficherCompte() throws SQLException, IOException, ClassNotFoundException {

    }
}