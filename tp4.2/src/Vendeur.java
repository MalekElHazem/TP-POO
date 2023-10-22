public class Vendeur extends Salaire{
    private double Vente;
    private double Pourcentage;

    Vendeur(int Matricule, String Nom, int Annee_Recroutement, double Vente, double Pourcentage)
    {
        super(Matricule,Nom,Annee_Recroutement);
        this.Vente = Vente;
        this.Pourcentage = Pourcentage;
    }

    public double getVente() {
        return Vente;
    }

    public double getPourcentage() {
        return Pourcentage;
    }

    public void setVente(double vente) {
        Vente = vente;
    }

    public void setPourcentage(double pourcentage) {
        Pourcentage = pourcentage;
    }

    void affiche()
    {
        super.afficher();
        System.out.println("Vente :" + Vente);
        System.out.println("Pourcentage :" + Pourcentage);
    }

    double salaireE()
    {
        return super.salaire() + (Vente * Pourcentage);
    }
}
