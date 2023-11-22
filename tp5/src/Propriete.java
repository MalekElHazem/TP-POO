import java.util.function.Predicate;

abstract public class Propriete {
    int id;
    Personne responsable;
    String adresse;
    double surface;

    Propriete(int id, Personne responsable, String adresse, double surface){
        this.id = id;
        this.responsable = responsable;
        this.adresse = adresse;
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Propriete{" +
                "id=" + id +
                ", responsable=" + responsable +
                ", adresse='" + adresse + '\'' +
                ", surface=" + surface +
                '}';
    }

    abstract double calculImpot();

    public Personne getResponsable() {
        return responsable;
    }

    public void setResponsable(Personne responsable) {
        this.responsable = responsable;
    }

    public double getSurface() {
        return surface;
    }

    public String getAdresse() {
        return adresse;
    }

    public abstract int getnbpieces();
}
