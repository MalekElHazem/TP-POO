public class CriterePrix implements Critere{
    double prix_fix;
    CriterePrix(double p){
        this.prix_fix = p;
    }
    public boolean correspond(Object o){
        if (o instanceof Voiture){
            Voiture v = (Voiture) o;
            if (v.prix > prix_fix){
                return false;
            }else {
                return true;
            }
        }else {
            return false;
        }
    }

}
