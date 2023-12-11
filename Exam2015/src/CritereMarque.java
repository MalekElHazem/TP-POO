import java.util.Objects;

public class CritereMarque implements Critere {
    String marque_crit ;

    CritereMarque(String m){
        this.marque_crit = m;
    }
    public boolean correspond(Object o){
        if (o instanceof Voiture){
            Voiture v = (Voiture) o;
            if (!Objects.equals(v.marque, marque_crit)){
                return false;
            }else {
                return true;
            }
        }else {
            return false;
        }
    }

}
