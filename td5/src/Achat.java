public class Achat {
    static Article[] supermarche = new Article[4];

    public static void main(String[] args) {
        // Remplissage du tableau supermarche
        supermarche[0] = new Vetement(123, "Jupe bleue taille S", 39.0f, 2, "Bleu", "S");
        supermarche[1] = new ProduitElec(145, "TV Led 80cm", 1450.0f, 0, "TV");
        supermarche[2] = new Vetement(178, "Pantalon noir taille M", 42.0f, 5, "Noir", "M");
        supermarche[3] = new ProduitGC(191, "Pâtes", 0.41f, 18);

        // Opération d'achat réalisée par un client le 21 Mars 2023
        String dateAchat = "21/03/2023";
        float montantTotal = 0;

        for (Article article : supermarche) {
            System.out.println("----------");
            article.decrire();
            if (article.estDispo(1)) {
                float prixTTC = ((Promotion) article).prixDeVente(dateAchat);
                System.out.println("Prix TTC à payer : " + prixTTC);
                montantTotal += prixTTC;
            } else {
                System.out.println("Article indisponible. Approvisionnement nécessaire.");
                article.approvisionner(1);
            }
        }

        System.out.println("Montant total à payer : " + montantTotal);
    }
}
