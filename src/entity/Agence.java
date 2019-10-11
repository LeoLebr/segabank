package entity;

public class Agence {
    private int idAgence;
    private int codeAgence;
    private String adresse;

    public int getIdAgence() {
        return idAgence;
    }

    public void setIdAgence(int idAgence) {
        this.idAgence = idAgence;
    }

    public int getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(int codeAgence) {
        this.codeAgence = codeAgence;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Agence(int idAgence, int codeAgence, String adresse) {
        this.idAgence = idAgence;
        this.codeAgence = codeAgence;
        this.adresse = adresse;


    }
}
