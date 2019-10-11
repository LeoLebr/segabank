package bo;

public class CompteSimple extends Compte {

    private float unDecouvert;

    public CompteSimple(){}

    public  CompteSimple(float solde, float unDecouvert, int agendeId){
        super(solde, agendeId);
        this.unDecouvert = unDecouvert;
        setType(1);
    }

    @Override
    public void retrait(float montant){
        if(montant > 0){
            if(getSolde() - montant > (-unDecouvert)){
                setSolde(getSolde() - montant);
            }else{
                System.out.println("Le retrait n'est pas réalisable, le compte est à découvert");
            }
            System.out.println("Il y a eu un retrait de " + montant + "€ sur le compte n°" + getId());
        }else{
            System.out.println("Un virement négatif n'est pas réalisable");
        }
    }

    @Override
    public String toString() {
        return "CompteSimple{" +
                "id=" + getId() +
                ", solde=" + getSolde() +
                ", unDecouvert=" + unDecouvert +
                '}';
    }

    public float getUnDecouvert() {
        return unDecouvert;
    }

    public void setUnDecouvert(float unDecouvert) {
        this.unDecouvert = unDecouvert;
    }
}
