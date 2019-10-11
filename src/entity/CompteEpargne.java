package entity;

public class CompteEpargne extends Compte {
    private double tauxInteret=1.5; //tauxInteret est un pourcentage

    public CompteEpargne(int idCompte, double solde, String typeOperation, double montantOperation, double tauxInteret) {
        super(idCompte, solde, typeOperation, montantOperation);
        this.tauxInteret = tauxInteret;
    }

    public double calculInteret(double tauxInteret, double solde){
       solde = solde+(solde*(tauxInteret/100));
       return solde;
    }
}
