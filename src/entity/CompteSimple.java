package entity;

public class CompteSimple extends Compte {
    private double valDecouvert;

    //Controleur principal de CompteSimple
    public CompteSimple(int idCompte, double solde, String typeOperation, int montantOperation, double valDecouvert) {
        super(idCompte, solde, typeOperation, montantOperation);
        this.valDecouvert = valDecouvert;
    }

    public double getValDecouvert() {
        return valDecouvert;
    }

    public void setValDecouvert(double valDecouvert) {
        this.valDecouvert = valDecouvert;
    }
}
