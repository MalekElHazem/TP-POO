public class AgenceMobiliere {
    Vehicule[] tab;
    final int max;
    int nb = 0;
    AgenceMobiliere(int max)
    {
        this.tab = new Vehicule[max];
        this.max = max;
    }
    void ajoutVehicule(Vehicule v)
    {
        if (nb < max)
        {
            tab[nb] = v;
            nb++;
        }
        else
        {
            System.out.println("The table is full.");
        }
    }

    void selection(int n)
    {
        if (tab[n] != null)
        {
            tab[n].decrisVehicule();
        }
        else
        {
            System.out.println("Case not found!!!");
        }
    }
    void selection(String mq)
    {
        boolean found = false;
        for ( int i = 0; i < nb; i++)
        {
            if (tab[i].getMark() == mq)
            {
                tab[i].decrisVehicule();
                found = true;
            }
        }
        if (found == false)
        {
            System.out.println("il n’y a pas de véhicules de cette marque!");
        }
    }

    void selection(Double px)
    {
        boolean found = false;
        for ( int i = 0; i < nb; i++)
        {
            if (tab[i].getPrix() < px)
            {
                tab[i].decrisVehicule();
                found = true;
            }
        }
        if (found = false)
        {
            System.out.println("il n’y a pas de véhicules dans cette marge de prix ");
        }
    }

    void ancien()
    {
        Vehicule plus = tab[0];
        int an = tab[0].getAnnee_creation();
        for ( int i = 1; i < nb; i++)
        {
            if (tab[i].getAnnee_creation() < an)
            {
                an = tab[i].getAnnee_creation();
                plus = tab[i];
            }
        }
        plus.decrisVehicule();
    }
}
