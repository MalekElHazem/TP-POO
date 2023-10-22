public class Magazine extends Livre {
    private int moisParution;

    public Magazine(String titre, int identifiant, String domaine, int nbPages, int moisParution)
    {
        super(titre, identifiant, domaine, nbPages);
        this.moisParution = moisParution;
    }

    @Override
    public String toString()
    {
        return "Magazine: " + super.toString() + ", Mois de Parution: " + moisParution;
    }

    public double calculePrix(int bonus)
    {
        return (0.35 * nbPages) * (1 + TVA) + bonus;
    }
}