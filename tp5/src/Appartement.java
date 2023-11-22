public class Appartement extends ProprietePrivee{
    int numEtage;
    Appartement(int id, Personne responsable, String adresse, double surface, int nbPieces, int numEtage){
        super(id, responsable, adresse, surface, nbPieces);
        this.numEtage = numEtage;
    }

    @Override
    public String toString() {
        return super.toString() + "Appartement{" +
                "numEtage=" + numEtage +
                '}';
    }
}
