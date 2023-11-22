public class ProprietePrivee extends Propriete {
    int nbPieces;
    ProprietePrivee(int id, Personne responsable, String adresse, double surface, int nbPieces){
        super(id, responsable, adresse, surface);
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return super.toString() + "ProprietePrivee{" +
                "nbPieces=" + nbPieces +
                '}';
    }

    double calculImpot(){
        return 50 * getSurface() / 100 + 10 * nbPieces;
    }

    @Override
    public int getnbpieces() {
        return 0;
    }
}
