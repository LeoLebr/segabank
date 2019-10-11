package entity;

public class ComptePayant extends Compte {
    private int tauxOperation;

    public ComptePayant(int idCompte, double solde, String typeOperation, double montantOperation, int tauxOperation) {
        super(idCompte, solde, typeOperation, montantOperation);
        this.tauxOperation = tauxOperation;
    }
}
