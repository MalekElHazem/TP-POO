import java.util.Set;

public class Compte {
    static private int n;
    private int number;
    private Personne titulaire;
    private double solde;
    private double decouvertMax;
    private double debitMax;
    private boolean estADecouvert;
    Compte (Personne p)
    {
        n++;
        this.number = n;
        this.titulaire = p;
        this.solde = 0;
        this.decouvertMax = -800;
        this.debitMax = 1000;
    }
    Compte (Personne p, double solde, double decouvertMax, double debitMax)
    {
        n++;
        this.number = n;
        this.titulaire = p;
        this.solde = solde;
        this.decouvertMax = decouvertMax;
        this.debitMax = debitMax;
    }
    @Override
    public String toString()
    {

        return "**************************\nNumber :" + number + "\n" + titulaire + "\nSolde :" + solde + "\ndecouvertMax :" + decouvertMax + "\ndebitMax :" + debitMax;
    }

    void créditer(double montant, Compte c)
    {
        if (montant > 0)
        {
            c.solde += montant;
        }
    }

    private void débiter(double montant, Compte c)
    {
        if ((montant > 0) && (c.solde - montant > decouvertMax) && (montant <= debitMax))
        {
            c.solde -= montant;
        }
    }

    void retrait(double montant, Compte c)
    {
        if (montant <= debitMax)
        {
            débiter(montant, c);
            this.estADecouvert = estaDécouvert();
        }
    }

    boolean estaDécouvert()
    {
        if (this.solde < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    double MontantDécouvert(Compte c)
    {
        if (c.estADecouvert)
        {
            return c.solde;
        }
        else
        {
            return 0;
        }
    }

    void Virement(Compte c, double montant)
    {
        if (this.MontantDécouvert(this) - montant < decouvertMax)
        {
            this.retrait(montant, this);
            c.créditer(montant, c);
        }
    }

    static void Virement(Compte c1, Compte c,double montant)
    {
        if (c1.getSolde() - montant >= c1.decouvertMax && montant <= c1.debitMax)
        {
            c1.Setsolde(c1.getSolde() - montant);
            c.Setsolde(c.getSolde() + montant);
        }
    }



    void Setsolde(double solde)
    {
        this.solde=solde;
        this.estADecouvert=this.estaDécouvert();

    }

    public double getSolde() {
        return solde;
    }
}
