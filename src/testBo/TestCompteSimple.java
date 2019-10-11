package testBo;

import bo.CompteSimple;

public class TestCompteSimple {

    public static void main(String[] args) {
        
        CompteSimple cptSi;

        System.out.println("---------------------------");
        System.out.printf("%nTU -- Création d'un compte simple%n");
        cptSi = new CompteSimple(1400.00f, 400f, 1);
        System.out.println(cptSi.toString());
        System.out.println("---------------------------");

        System.out.printf("%nTU -- Versement d'un montant de 300.00€ sur le compte simple%n");
        System.out.println("Solde avant versement : " + cptSi.getSolde() + "€");
        cptSi.versement(300f);
        System.out.println("Solde après versement : " + cptSi.getSolde() + "€");
        System.out.println("---------------------------");

        System.out.printf("%nTU -- Retrait d'un montant 500.00€ sur le compte simple%n");
        System.out.println("Solde avant retrait : " + cptSi.getSolde() + "€");
        cptSi.retrait(500.00f);
        System.out.println("Solde après retrait : " + cptSi.getSolde() + "€");
        System.out.println("---------------------------");

        System.out.printf("%nTU -- Retrait d'un montant de 1700€ sur le compte simple -> A découvert%n");
        System.out.println("Solde avant retrait découvert : " + cptSi.getSolde() + "€");
        cptSi.retrait(1700.00f);
        System.out.println("Solde après retrait : " + cptSi.getSolde() + "€");
        System.out.println("---------------------------");

        System.out.printf("%nTU -- Retrait d'un montant 20.00€ sur le compte simple -> Non découvert%n");
        System.out.println("Solde avant retrait découvert : " + cptSi.getSolde() + "€");
        cptSi.retrait(20.00f);
        System.out.println("Solde après retrait découvert : " + cptSi.getSolde() + "€");
        System.out.println("---------------------------");


    }
}
