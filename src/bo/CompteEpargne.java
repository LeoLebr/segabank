package bo;

public class CompteEpargne extends Compte {

    private float tauxInter;

    public CompteEpargne(){}

    public CompteEpargne(float solde, float tauxInter, int agenceId) {
        super(solde, agenceId);
        this.tauxInter = tauxInter;
        setType(2);
    }

    public void calculInteret(){
        float unInteret = getSolde() + (getSolde() * (tauxInter / 100));
        setSolde(unInteret);
        System.out.println("Il y a des intérêts de " + unInteret + "€ sur le compte n°" + getId());
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "id=" + getId() +
                ", solde=" + getSolde() +
                ", tauxInter=" + tauxInter +
                '}';
    }

    public float getTauxInter() {
        return tauxInter;
    }

    public void setTauxInter(float tauxInter) {
        this.tauxInter = tauxInter;
    }
}
