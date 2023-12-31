abstract class Article {
    protected long reference;
    protected String libelle;
    protected float prixHT;
    protected int qteStock;
    protected static final float TVA = 0.1f;

    public Article(long ref, String lib, float p, int q) {
        reference = ref;
        libelle = lib;
        prixHT = p;
        qteStock = q;
    }

    public void approvisionner(int nb) {
        qteStock += nb;
    }

    public void decrire() {
        System.out.println("Référence : " + reference);
        System.out.println("Libellé : " + libelle);
    }

    public abstract float calculPrixTTC();

    public boolean appartientPromo() {
        return this instanceof ProduitElec || this instanceof Vetement;
    }

    public boolean estDispo(int qteAchat) {
        return qteAchat <= qteStock;
    }
}