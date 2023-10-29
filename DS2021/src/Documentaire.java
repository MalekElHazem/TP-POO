class Documentaire extends Film {
    private String sujet;
    private static float tarif = 2.0f;

    public Documentaire(String titre, String realisateur, String paysOrigine, int duree, String sujet) {
        super(titre, realisateur, paysOrigine, duree);
        this.sujet = sujet;
    }

    @Override
    public float totalVenteBillets() {
        int nbBillets = getNbPlacesReservees();
        return tarif * nbBillets;
    }

    @Override
    public String toString() {
        return super.toString() + " - Sujet: " + sujet;
    }
}
