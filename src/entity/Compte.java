package entity;

public class Compte {
    private int idCompte;
    private double solde;
    private String typeOperation;
    private double montantOperation;

    //Premier constructeur
    public Compte(int idCompte, double solde, String typeOperation, double montantOperation) {
        this.idCompte = idCompte;
        this.solde = solde;
        this.typeOperation = typeOperation;
        this.montantOperation = montantOperation;
    }

    //Constructeur par défaut
    public Compte() {
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public double getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(double montantOperation) {
        this.montantOperation = montantOperation;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Compte{" +
                "idCompte=" + idCompte +
                ", solde=" + solde +
                ", typeOperation='" + typeOperation + '\'' +
                ", montantOperation=" + montantOperation +
                '}';
    }
}