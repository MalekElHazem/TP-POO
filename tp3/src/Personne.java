public class Personne {
    private String nom;
    private String prenom;
    private String adresse;

    Personne(String nom, String prenom, String adresse)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    @Override
    public String toString()
    {
        return "Name :" + nom + " " + prenom + "\nAdresse: " + adresse;
    }

    public String getNom()
    {
        return this.nom;
    }
    public String getPrenom()
    {
        return this.prenom;
    }
    public String getAdresse()
    {
        return this.adresse;
    }
}
