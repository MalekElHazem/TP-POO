class Jcc {
    private Film[] competition;
    private int annee;
    private static final int NBFMAX = 30;
    private int nbF;

    public Jcc(int annee) {
        this.annee = annee;
        this.competition = new Film[NBFMAX];
        this.nbF = 0;
    }

    public void ajoutFilm(Film f) {
        if (nbF < NBFMAX) {
            competition[nbF] = f;
            nbF++;
        } else {
            System.out.println("La compétition est au complet.");
        }
    }

    public void listeFilmsJCC() {
        System.out.println("Films en compétition pour les JCC " + annee + ":");
        for (int i = 0; i < nbF; i++) {
            System.out.println((i + 1) + ". " + competition[i]);
        }
    }

    public float totalVenteBilletsJCC() {
        float totalVente = 0;
        for (int i = 0; i < nbF; i++) {
            totalVente += competition[i].totalVenteBillets();
        }
        return totalVente;
    }

}