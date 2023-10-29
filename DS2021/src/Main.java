public class Main {
    public static void main(String[] args) {
        Jcc jcc2021 = new Jcc(2021);
        Film film1 = new Film("Le dernier refuge", "Ousman Mali", "La guerre civile", 86);
        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);

        film1.setNbPlacesReservees(30);
        film2.setNbPlacesReservees(45);

        jcc2021.ajoutFilm(film1);
        jcc2021.ajoutFilm(film2);

        jcc2021.listeFilmsJCC();
        System.out.println("Montant total des ventes de billets pour les JCC 2021 : " + jcc2021.totalVenteBilletsJCC() + " DT");
    }
}