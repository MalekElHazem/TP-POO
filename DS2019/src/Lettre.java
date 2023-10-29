public class Lettre extends Courrier{
    double poids;
    boolean format;

    Lettre(boolean expedition, String adresse_destination, double poids, boolean format)
    {
        super(expedition, adresse_destination);
        this.poids = poids;
        this.format = format;
    }
    void decrire()
    {
        super.decrire();
        System.out.println("Poids :" + poids);
        if (format == true)
        {
            System.out.println("Format :A4");

        }
        else
        {
            System.out.println("Format :A3");
        }
    }
    double affranchir()
    {
        if (format == true)
        {
            if (expedition == true)
            {
                return (2.50 + 0.5 * (poids / 1000)) * 2;
            }
            else
            {
                return 2.50 + 0.5 * (poids / 1000);
            }
        }
        else
        {
            if (expedition == true)
            {
                return (3.50 + 0.5 * (poids / 1000)) * 2;
            }
            else
            {
                return 3.50 + 0.5 * (poids / 1000);
            }
        }
    }
}
