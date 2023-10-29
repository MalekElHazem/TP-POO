public class Vetement {
    private String code;
    private String libille;
    private String color;
    private float prix_HT;
    private int quantite;
    private static int pourentage = 18;
    Vetement (String lib, float pht, String code, String c)
    {
        this.libille = lib;
        this.prix_HT = pht;
        this.code = code;
        this.color = c;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String toString()
    {
        return code + " veste " + color + " : prixHT= " + prix_HT + " DT et qté = " + quantite;
    }

    float prixTTC ()
    {
        return prix_HT * (1 + pourentage / 100);
    }

    float prixTTC (int remise)
    {
        return prixTTC() * (1 - remise /100);
    }
}
