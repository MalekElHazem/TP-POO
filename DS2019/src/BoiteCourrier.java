public class BoiteCourrier {
    int n ;
    Courrier tab[];

    BoiteCourrier(int n)
    {
        this.tab = new Courrier[n];
        this.n = n;
    }


    double affranchir(Courrier tab[])
    {
        double montant_total = 0;
        for (int i = 0; i < n; i++)
        {
            montant_total += tab[i].affranchir();
        }
        return montant_total;
    }

    int courriersInvalides(Courrier tab[])
    {
        int nbCourrier_inv = 0;
        for (int i = 0; i < n; i++)
        {
            if (!tab[i].Valide())
            {
                nbCourrier_inv++;
            }
        }
        return nbCourrier_inv;
    }

    void afficher()
    {
        System.out.println("******************************************************");
        for (int i = 0; i < n; i++)
        {
            tab[i].decrire();
            if (!tab[i].Valide())
            {
                System.out.println("Invalid.");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        BoiteCourrier b=new BoiteCourrier(3);
        b.tab[0] = new Courrier(true, "");
        b.tab[1] = new Lettre(false, "loj", 45, true);
        b.tab[2] = new Colis(true, "rol", 6, 88);

        b.afficher();

        double montant_total = b.affranchir(b.tab);
        int Courrier_invalide = b.courriersInvalides(b.tab);

        System.out.println("Montant total :" + montant_total);
        System.out.println("Nb de Courrier Invalide :" + Courrier_invalide);

        b.afficher();
    }
}
