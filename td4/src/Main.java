public class Main {
    public static void main(String[] args) {
        Librairie librairie = new Librairie(4);


        Livre livre1 = new Livre("Livre 1", 1, "Fiction", 200);
        Roman roman1 = new Roman("Roman 1", 2, "Romance", 300, "Auteur 1", "Editeur 1");
        Magazine magazine1 = new Magazine("Magazine 1", 3, "Actualités", 50, 10);

        librairie.ajoutLiv(livre1);
        librairie.ajoutLiv(roman1);
        librairie.ajoutLiv(magazine1);


        librairie.inventaire();


        Roman roman2 = new Roman("Roman 2", 4, "Drame", 250, "Auteur 2", "Editeur 2");
        librairie.ajoutLiv(roman2);


        librairie.inventaire("Roman");


        double montantTotal = 0;

        for (Livre livre : librairie.getListe())
        {
            if (livre instanceof Roman)
            {
                montantTotal += livre.calculePrix();
            }
        }

        System.out.println("Le montant total à payer pour les romans est : " + montantTotal);


        Magazine magazine2 = new Magazine("Magazine 2", 5, "Santé", 60, 7);
        librairie.ajoutLiv(magazine2);
    }
}
