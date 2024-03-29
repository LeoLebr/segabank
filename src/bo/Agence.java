package bo;

import java.util.List;

public class Agence {

    private int id;
    private String code;
    private String adresse;
    private List<Compte> comptes;

    public Agence(){}

    public Agence(int id, String code, String adresse, List<Compte> comptes) {
        this.id = id;
        this.code = code;
        this.adresse = adresse;
        this.comptes = comptes;
    }

    @Override
    public String toString() {
        return "Agence {" +
                "Identifiant = " + id +
                ", Code d'Agence = '" + code + '\'' +
                ", Adresse = '" + adresse + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
