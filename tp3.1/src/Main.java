
public class Main {
    public static void main(String[] args) {
        AgenceMobiliere agence = new AgenceMobiliere(3);
        Vehicule v = new Vehicule("Clio", "Classique", 2000, 20);
        Vehicule w = new Vehicule("Mercedes", "Fantome", 2008, 60 );
        Vehicule x = new Vehicule("KIA", "Picanto", 2012, 35 );
        /*v.decrisVehicule();
        w.decrisVehicule();
        x.decrisVehicule();*/
        agence.ajoutVehicule(v);
        agence.ajoutVehicule(w);
        agence.ajoutVehicule(x);
        /*agence.selection("Mercedes");
        //agence.selection(0);
        agence.selection(40.000);*/
        agence.ancien();
    }
}