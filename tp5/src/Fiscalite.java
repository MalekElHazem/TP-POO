public class Fiscalite {
    public static void main(String[] args) {

        Personne p1 = new Personne(123, "Nom1", "Prenom1");
        Personne p2 = new Personne(456, "Nom2", "Prenom2");
        Personne p3 = new Personne(789, "Nom3", "Prenom3");


        Lotissement lotissement = new Lotissement(10);


        lotissement.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        lotissement.ajouter(new ProprieteProfessionnelle(4, p3, "Korba", 1000, 50, true));
        lotissement.ajouter(new ProprieteProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false));



        lotissement.afficherProprietes();


        System.out.println("Nombre de pièces : " + lotissement.getnbPieces());




        Propriete min = lotissement.tabProp[0];
        double mins = min.calculImpot();

        for (int i = 1; i < lotissement.nombre; i++) {
            double impot = lotissement.tabProp[i].calculImpot();
            if (impot < mins) {
                mins = impot;
                min = lotissement.tabProp[i];
            }
        }


        if (min != null) {
            System.out.println("Propriétaire de la propriété privée avec le moins d'impôts : " + min.getResponsable().toString());
            System.out.println("Montant des impôts : " + min.calculImpot() + " DT");
        }


        Propriete appartementHammamet = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
        lotissement.supprimer(appartementHammamet);
        System.out.println("Après suppression de l'appartement du Hammamet:");
        lotissement.afficherProprietes();





    }
}
