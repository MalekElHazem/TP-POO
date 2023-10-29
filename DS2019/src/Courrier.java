public class Courrier {
    protected boolean expedition;
    protected String adresse_destination;
    protected static double tarif = 0.5;

    Courrier(boolean expedition, String adresse_destination)
    {
        this.expedition = expedition;
        this.adresse_destination =adresse_destination;
    }

    boolean Valide()
    {
        if(adresse_destination.length()==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    void decrire()
    {
        if (expedition == true)
        {
            System.out.println("Expedition :Express");

        }
        else
        {
            System.out.println("Expedition :normal");
        }
        System.out.println("Adresse de destination :" + adresse_destination);
        System.out.println("Tarif :" + tarif);
    }

    double affranchir()
    {
        if (this.Valide())
        {
            if (expedition == true)
            {
                return tarif * 2;
            }
            else
            {
                return tarif;
            }
        }
        else
        {
            return 0;
        }
    }
}
