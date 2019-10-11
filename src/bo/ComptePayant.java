package bo;

public class ComptePayant extends Compte{

    public static final float FRAIS = 0.05f;

    public ComptePayant(){}

    public ComptePayant(float solde, int agenceId){
        super(solde, agenceId);
        setType(3);
    }

    @Override
    public void versement(float montant){
        if(montant > 0){
            setSolde(getSolde() + (montant - (montant * FRAIS)));
            System.out.println("Il y a eu un versement de " + montant + "€ sur le compte n°" + getId());
        }else{
            System.out.println("Un virement négatif n'est pas réalisable");
        }
    }

    @Override
    public void retrait(float montant){
        if(montant > 0){
            float fraisPlusMontant = (montant + (montant * FRAIS));
            if(getSolde() - fraisPlusMontant >= 0){
                setSolde(getSolde() - fraisPlusMontant);
            }else{
                System.out.println("Le retrait n'est pas réalisable, le retrait est supérieur au solde du compte");
            }
            System.out.println("Il y a eu un retrait de " + montant + "€ sur le compte n°" + getId());
        }else{
            System.out.println("Un virement négatif n'est pas réalisable");
        }
    }

    @Override
    public String toString() {
        return "ComptePayant{" +
                "id=" + getId() +
                ", solde=" + getSolde() +
                '}';
    }

}
