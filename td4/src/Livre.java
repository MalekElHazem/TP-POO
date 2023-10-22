public class Livre {
    private String titre;
    private int identifiant;
    private String domaine;
    protected int nbPages;
    protected static final double TVA = 0.10;

    public Livre(String titre, int identifiant, String domaine, int nbPages)
    {
        this.titre = titre;
        this.identifiant = identifiant;
        this.domaine = domaine;
        this.nbPages = nbPages;
    }

    public int getIdentifiant()
    {
        return identifiant;
    }
    public String toString()
    {
        return "Livre: " + titre + " (ID: " + identifiant + ", Domaine: " + domaine + ", Pages: " + nbPages + ")";
    }

    public double calculePrix()
    {
        return (0.075 * nbPages) * (1 + TVA);
    }
}
