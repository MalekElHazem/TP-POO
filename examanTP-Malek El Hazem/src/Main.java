// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InvalidStateException {

        Epreuve epreuve = new Epreuve("Java", 3);


        Athlete athlete1 = new Athlete(1, "Athlete 1");
        Athlete athlete2 = new Athlete(2, "Athlete 2");
        Athlete athlete3 = new Athlete(3, "Athlete 3");
    


        epreuve.ajouterAthlete(athlete1);
        epreuve.ajouterAthlete(athlete2);
        epreuve.ajouterAthlete(athlete3);



        epreuve.fixeResultat(athlete1.getId(), new ResultatDistance(10));
        epreuve.fixeResultat(athlete2.getId(), new ResultatDistance(20));
        epreuve.fixeResultat(athlete3.getId(), new ResultatDistance(5));




        epreuve.terminer();




        System.out.println("Winner: " + epreuve.getVinqueur().getNom());
        System.out.println("Record: " + epreuve.getRecordOlymique());

    }
}