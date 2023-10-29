public class Main {
    public static void main(String[] args) {
        Boutique b = new Boutique("B1", 50);

        Vetement v = new Vetement("M", 12.5F, "V45", "Black");
        Vetement v1 = new Vetement("S", 10.5F, "V1", "Green");

        b.ajoutVetement(v);
        b.ajoutVetement(v1);

        b.afficheStock(60);
    }
}