class Film {
    private String titre;
    private String realisateur;
    private String paysOrigine;
    private int duree;
    private int nbPlacesReservees;

    public Film(String titre, String realisateur, String paysOrigine, int duree) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.paysOrigine = paysOrigine;
        this.duree = duree;
        this.nbPlacesReservees = 0;
    }

    public int getNbPlacesReservees() {
        return nbPlacesReservees;
    }

    public void setNbPlacesReservees(int nbPlacesReservees) {
        this.nbPlacesReservees = nbPlacesReservees;
    }

    public float totalVenteBillets() {
        int tarifEtudiant = 2;
        int tarifPublic = 3;
        int nbBilletsEtudiant = nbPlacesReservees;
        int nbBilletsPublic = 0;
        return (tarifEtudiant * nbBilletsEtudiant) + (tarifPublic * nbBilletsPublic);
    }

    @Override
    public String toString() {
        return titre + " de " + realisateur + " (" + paysOrigine + ") - " + duree + "min.";
    }
}