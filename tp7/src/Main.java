// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Epreuve e = new Epreuve("Java", 3);
        Candidat c1 = new Candidat(1,"Malek 1");
        Candidat c2 = new Candidat(2,"Malek 2");
        Candidat c3 = new Candidat(3,"Malek 3");
        e.ajoutCandidat(c1);
        e.ajoutCandidat(c2);
        e.ajoutCandidat(c3);


        System.out.println(e);

        e.fixeResultat(1, new ResultatOral('A'));
        e.fixeResultat(2, new ResultatPoints(85));
        e.fixeResultat(3, new ResultatOral('B'));

        System.out.println(e);

        Candidat vainqueur = e.getVinqueur();
        Resultat record = e.getRecord();

        System.out.println("Vainqueur : " + (vainqueur != null ? vainqueur.getNon() : "Aucun"));
        System.out.println("Meilleur résultat : " + (record != null ? record.toString() : "Aucun"));
    }
}