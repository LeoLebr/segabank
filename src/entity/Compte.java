package entity;

public class Compte {
    private int idCompte;
    private int solde;
    private String typeOperation;
    private int montantOperation;

    public Compte(int idCompte, int solde, String typeOperation, int montantOperation) {
        this.idCompte = idCompte;
        this.solde = solde;
        this.typeOperation = typeOperation;
        this.montantOperation = montantOperation;
    }


    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public int getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(int montantOperation) {
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