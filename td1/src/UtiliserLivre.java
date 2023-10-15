public class UtiliserLivre {
    public static void main(String[] args) {
        Livre l1 = new Livre("a1", "t1");
        Livre l2 = new Livre("a1", "t2");
        if (l1.getAuteur() == l2.getAuteur())
        {
            System.out.println("Meme auteur");
        }
        l1.setNbPages(225);
        l2.setNbPages(20);
        System.out.println(l1);
        System.out.println(l2);
        l1.decrire();
    }
}
