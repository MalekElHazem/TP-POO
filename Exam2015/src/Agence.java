public class Agence {
    Voiture Lesvoitures[];
    String reference;
    int taille;
    int nbrvoitures;


    Agence(int taille){
        this.taille = taille;
        this.Lesvoitures = new Voiture[taille];
        this.nbrvoitures = 0;
    }


    void selectionne(Critere c)
    {
        for ( int i = 0; i < nbrvoitures;i++){
            if (c.correspond(Lesvoitures[i])){
                System.out.println(Lesvoitures[i]);
            }
        }
    }

    void ajout(Voiture v) throws New{
        if (taille > nbrvoitures && (v.anneP-2016) < 5){
            Lesvoitures[nbrvoitures] = v;
            nbrvoitures++;
        }else {
            System.out.println("Table Full");
            throw
        }
    }

}
