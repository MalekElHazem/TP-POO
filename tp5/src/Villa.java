public class Villa extends ProprietePrivee {
    boolean avecPiscine;
    Villa(int id, Personne responsable, String adresse, double surface, int nbPieces, boolean avecPiscine){
        super(id, responsable, adresse, surface, nbPieces);
        this.avecPiscine = avecPiscine;
    }

    @Override
    public String toString() {
        return super.toString() + "Villa{" +
                "avecPiscine=" + avecPiscine +
                '}';
    }

    double calculImpot(){
        if (avecPiscine){
            return super.calculImpot() + 200;
        }
        else {
            return super.calculImpot();
        }
    }
}
