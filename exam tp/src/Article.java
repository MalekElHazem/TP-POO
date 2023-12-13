public class Article {
    private int code;
    private String libelle;
    private int qteStock;
    private int stockMax;


    public Article(int code, String libelle, int qteStock, int stockMax) {
        this.code = code;
        this.libelle = libelle;
        this.qteStock = qteStock;
        this.stockMax = stockMax;
    }

    public int getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getQteStock() {
        return qteStock;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    @Override
    public String toString() {
        return "Article{" +
                "code=" + code +
                ", libelle='" + libelle + '\'' +
                ", qteStock=" + qteStock +
                ", stockMax=" + stockMax +
                '}';
    }


    public boolean equals(Article a) {
        if (this.libelle == a.libelle){
            return true;
        }else {
            return false;
        }
    }


}
