public class Salaire {
    private int Matricule;
    private String Nom;
    private double Annee_Recroutement;
    Salaire(int Matricule, String Nom, int Annee_Recroutement)
    {
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Annee_Recroutement = Annee_Recroutement;
    }

    public int getMatricule() {
        return Matricule;
    }

    public String getNom() {
        return Nom;
    }

    public double getAnnee_Recroutement() {
        return Annee_Recroutement;
    }

    public void setMatricule(int matricule) {
        Matricule = matricule;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setAnnee_Recroutement(int annee_Recroutement) {
        Annee_Recroutement = annee_Recroutement;
    }

    public void afficher()
    {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Matricule :" + Matricule);
        System.out.println("Nom :" + Nom);
        System.out.println("Annee de Recroutement :" + Annee_Recroutement);
    }

    public double salaire()
    {
        if (getAnnee_Recroutement() < 2005)
        {
            return 400;
        }
        else
        {
            return 280;
        }
    }



}
