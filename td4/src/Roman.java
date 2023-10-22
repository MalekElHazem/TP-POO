public class Roman extends Livre {
    private String nomAuteur;
    private String editeur;

    public Roman(String titre, int identifiant, String domaine, int nbPages, String nomAuteur, String editeur)
    {
        super(titre, identifiant, domaine, nbPages);
        this.nomAuteur = nomAuteur;
        this.editeur = editeur;
    }

    @Override
    public String toString()
    {
        return "Roman: " + super.toString() + ", Auteur: " + nomAuteur + ", Editeur: " + editeur;
    }

    @Override
    public double calculePrix() {
        return (0.05 * nbPages) * (1 + TVA);
    }
}