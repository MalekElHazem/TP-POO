public class Colis extends Courrier{
    double poids;
    double volume;

    Colis(boolean expedition, String adresse_destination, double poids, double volume)
    {
        super(expedition, adresse_destination);
        this.poids = poids;
        this.volume = volume;
    }

    void decrire()
    {
        super.decrire();
        System.out.println("Poids :" + poids);
        System.out.println("Volume :" + volume);
    }

    double affranchir()
    {
        return 0.25 * volume + (poids / 1000) * 1.0;
    }
}
