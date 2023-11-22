class ProduitElec extends Article implements Promotion {
    private String categorie;

    public ProduitElec(long ref, String lib, float p, int q, String categorie) {
        super(ref, lib, p, q);
        this.categorie = categorie;
    }

    @Override
    public float calculPrixTTC() {
        return prixHT * (1.08f + TVA);
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Classe : Produit Electronique");
        System.out.println("Catégorie : " + categorie);
    }

    @Override
    public float prixDeVente(String dateStr) {
        if (estPeriodePromo(dateStr)) {
            return calculPrixTTC() * 0.8f;
        } else {
            return calculPrixTTC();
        }
    }
}