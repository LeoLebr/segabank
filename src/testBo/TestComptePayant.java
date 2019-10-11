package testBo;

import bo.ComptePayant;

public class TestComptePayant {

    public static void main(String[] args) {
        
        ComptePayant cptPa;

        System.out.println("---------------------------");
        System.out.printf("%nTU -- Création d'un compte payant%n");
        cptPa = new ComptePayant(2500.00f, 3);
        System.out.println(cptPa.toString());
        System.out.println("---------------------------");

        System.out.printf("%nTU -- Versement d'un montant de 270.00€ sur le compte payant%n");
        System.out.println("Solde avant versement : " + cptPa.getSolde() + "€");
        cptPa.versement(270f);
        System.out.println("Solde après versement : " + cptPa.getSolde() + "€");
        System.out.println("---------------------------");
//
        System.out.printf("%nTU -- Retrait d'un montant de 773€ sur le compte payant%n");
        System.out.println("Solde avant retrait : " + cptPa.getSolde() + "€");
        cptPa.retrait(773.00f);
        System.out.println("Solde après retrait : " + cptPa.getSolde() + "€");
        System.out.println("---------------------------");

        System.out.printf("%nTU -- Retrait au-delà du solde du compte payant%n");
        System.out.println("Solde avant retrait : " + cptPa.getSolde() + "€");
        cptPa.retrait(3000.00f);
        System.out.println("Solde après retrait : " + cptPa.getSolde() + "€");
        System.out.println("---------------------------");


    }
}
