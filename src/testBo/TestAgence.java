package testBo;

import bo.*;

import java.util.ArrayList;
import java.util.List;

public class TestAgence {

    public static void main(String[] args) {
        Agence ag;

        List<Compte> cpts = new ArrayList<>();

        CompteSimple cptSi = new CompteSimple(3123f, 200f, 2);
        CompteEpargne cptEp = new CompteEpargne(2015f, 2, 3);
        ComptePayant cptPa = new ComptePayant(1001F, 1);

        cpts.add(cptSi);
        cpts.add(cptEp);
        cpts.add(cptPa);

        System.out.println("---------------------------");
        System.out.printf("%nTU -- Création d'une agence%n");
        ag = new Agence(1, "123A", "3 rue des chemins", cpts);
        System.out.println(ag.toString());
        System.out.println("---------------------------");
    }

}
