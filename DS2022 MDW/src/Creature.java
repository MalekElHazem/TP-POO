public class Creature extends Carte{
    private String nom;
    private int nbr_degats;
    private int nbr_vie;

    Creature (int cout, String nom, int nbr_degats, int nbr_vie){
        super(cout);
        this.nom = nom;
        this.nbr_degats = nbr_degats;
        this.nbr_vie = nbr_vie;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "nom='" + nom + '\'' +
                ", nbr_degats=" + nbr_degats +
                ", nbr_vie=" + nbr_vie +
                '}';
    }
}
