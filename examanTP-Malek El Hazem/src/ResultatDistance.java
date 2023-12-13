public class ResultatDistance implements Resultat{
    private double distance;
    
    public ResultatDistance(double distance){
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        if(distance > 0){
            this.distance = distance;
        }
    }


    @Override
    public String toString() {
        return "ResultatDistance{" + "distance=" + distance + '}';
    }

    @Override
    public void afficher() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Resultat r) throws IllegalArgumentException {
        if(r instanceof ResultatDistance){
            ResultatDistance rd = (ResultatDistance) r;
            if(this.distance > rd.distance){
                return 1;
            }else if(this.distance < rd.distance){
                return -1;
            }else{
                return 0;
            }
        }else{
            throw new IllegalArgumentException("Resultat must be of type ResultatDistance");
        }
    }

}
