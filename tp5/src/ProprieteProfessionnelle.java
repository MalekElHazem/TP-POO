public class ProprieteProfessionnelle extends Propriete {
    private int nbEmploye;
    private boolean estEtatique;
    ProprieteProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmploye, boolean estEtatique){
        super(id, responsable, adresse, surface);
        this.nbEmploye = nbEmploye;
        this.estEtatique = estEtatique;
    }

    @Override
    public String toString() {
        return super.toString() + "ProprieteProfessionnelle{" +
                "nbEmploye=" + nbEmploye +
                ", estEtatique=" + estEtatique +
                '}';
    }

    double calculImpot(){
        if (estEtatique){
            return 0;
        }
        else {
            return 100 * getSurface() / 100 + 30 * nbEmploye;
        }
    }

    @Override
    public int getnbpieces() {
        return 0;
    }
}
