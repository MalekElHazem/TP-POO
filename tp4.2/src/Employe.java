public class Employe extends Salaire {
    private double Hsupp;
    private double PHsupp;

    Employe(int Matricule, String Nom, int Annee_Recroutement, double Hsupp, double PHsupp)
    {
        super(Matricule,Nom,Annee_Recroutement);
        this.Hsupp = Hsupp;
        this.PHsupp = PHsupp;
    }

    public double getHsupp() {
        return Hsupp;
    }

    public double getPHsupp() {
        return PHsupp;
    }

    public void setHsupp(double hsupp) {
        Hsupp = hsupp;
    }

    public void setPHsupp(double PHsupp) {
        this.PHsupp = PHsupp;
    }

    void affiche()
    {
        super.afficher();
        System.out.println("Hsupp :" + Hsupp);
        System.out.println("Hsupp :" + PHsupp);
    }

    double salaireE()
    {
        return super.salaire() + (Hsupp * PHsupp);
    }
}
