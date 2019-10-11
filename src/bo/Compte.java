package bo;

public abstract  class Compte {

    private int id;
    private int type;
    private float solde;
    private int agenceId;

    public Compte(){}

    public Compte(float solde, int agenceId){
        this.solde = solde;
        this.agenceId = agenceId;
    }

    public void versement(float montantVers){
        if(montantVers > 0) {
            solde += montantVers;
            System.out.println("Il y a eu un versement de " + montantVers + "€ sur le compte n°" + getId());
        }else{
            System.out.println("Un virement négatif n'est pas réalisable");
        }
    }

    public void retrait(float montantRetr){
        if(montantRetr > 0){
            if(getSolde() - montantRetr >=0){
                solde -= montantRetr;
                System.out.println("Il y a eu un retrait de " + montantRetr + "€ sur le compte n°" + getId());
            }else{
                System.out.println("Le retrait n'est pas réalisable, le retrait est supérieur au solde du compte");
            }
        }else{
            System.out.println("Un retrait négatif n'est pas réalisable");
        }
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(int agenceId) {
        this.agenceId = agenceId;
    }
}
