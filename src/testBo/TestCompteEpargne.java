package testBo;

import bo.CompteEpargne;

public class TestCompteEpargne {

    public static void main(String[] args) {
        CompteEpargne cptEp;

        System.out.println("---------------------------");
        System.out.printf("%nTU -- Création d'un compte épargne%n");
        cptEp = new CompteEpargne(2500.00f, 9, 2);
        System.out.println(cptEp.toString());
        System.out.println("---------------------------");

        System.out.printf("%nTU -- Versement d'un montant de 300.00€ sur le compte épargne%n");
        System.out.println("Solde avant versement : " + cptEp.getSolde() + "€");
        cptEp.versement(300f);
        System.out.println("Solde après versement : " + cptEp.getSolde() + "€");
        System.out.println("---------------------------");
//
        System.out.printf("%nTU -- Retrait de 585€ sur le compte épargne%n");
        System.out.println("Solde avant retrait : " + cptEp.getSolde() + "€");
        cptEp.retrait(585.00f);
        System.out.println("Solde après retrait : " + cptEp.getSolde() + "€");
        System.out.println("---------------------------");

        System.out.printf("%nTU -- Retrait au-delà du solde du compte épargne%n");
        System.out.println("Solde avant retrait : " + cptEp.getSolde() + "€");
        cptEp.retrait(2800.00f);
        System.out.println("Solde après retrait : " + cptEp.getSolde() + "€");
        System.out.println("---------------------------");

        System.out.printf("%nTU -- Calcul d'intérêts%n");
        System.out.println("Intérêts de " + cptEp.getTauxInter() + "%");
        System.out.println("Solde avant calcul d'intérêts : " + cptEp.getSolde() + "€");
        cptEp.calculInteret();
        System.out.println("Solde après calcul d'intérêts : " + cptEp.getSolde() + "€");
        System.out.println("---------------------------");


    }
}
