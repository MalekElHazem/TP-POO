import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Personne p = new Personne("blake", "john", "rue");
        System.out.println(p);
        Compte c = new Compte(p);
        System.out.println(c);
        Compte c1 = new Compte(p);
        System.out.println(c1);
        Compte c2 = new Compte(p);
        System.out.println(c2);*/
        /*Compte c3 = new Compte(p);
        System.out.println(c3);
        Compte c4 = new Compte(p);
        System.out.println(c4);
        c4.créditer(500, c4);
        System.out.println(c4);
        c4.retrait(100, c4);
        System.out.println(c4);
        System.out.println(c4.estaDécouvert());
        System.out.println(c4.MontantDécouvert(c4));
        c4.Virement(c3,150);
        System.out.println(c3);
        System.out.println(c4);*/


        TestCompte t = new TestCompte(2);
        t.afficher();
        t.comptes[0].créditer(500, t.comptes[0]);
        t.comptes[1].créditer(200, t.comptes[1]);


        //t.comptes[0].Virement(t.comptes[1], 150);

        t.comptes[0].Virement(t.comptes[0], t.comptes[1], 10);


        t.afficher();
        t.afficher_solde_elve();
    }
}