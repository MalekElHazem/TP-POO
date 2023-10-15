// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Livre[] livres = new Livre[3];
        livres[0] = new Livre("Coelho", "L'alchimiste", 225);
        livres[1] = new Livre(508, "Le Coran");
        livres[2] = new Livre("JK Rowling", "Harry Potter");

        for (int i = 0; i < livres.length; i++) {
            System.out.println("Livre " + (i + 1) + ":");
            livres[i].decrire();
            System.out.println();
        }
        livres[1].setAuteur("Paulo Coelho");
        livres[2].setNbPages(461);

        for (int i = 0; i < livres.length; i++) {
            System.out.println("Livre " + (i + 1) + ":");
            livres[i].decrire();
            System.out.println();
        }

        System.out.println("Le prix du livre 1 est fixé : " + livres[0].testPrix());
        System.out.println("Le prix du livre 2 est fixé : " + livres[1].testPrix());
        System.out.println("Le prix du livre 3 est fixé : " + livres[2].testPrix());

        livres[2].setPrix(40);

        System.out.println("\nLe prix du livre 1 est fixé : " + livres[0].testPrix());
        System.out.println("Le prix du livre 2 est fixé : " + livres[1].testPrix());
        System.out.println("Le prix du livre 3 est fixé : " + livres[2].testPrix());

        livres[2].setPrix(4540);
    }
}