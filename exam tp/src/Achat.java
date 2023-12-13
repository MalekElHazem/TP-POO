public class Achat extends OperationStock{
    private double prixAchat;
    private int qtAchete;



    Achat(Article art, double prixAchat, int qtAchete) throws QteArticleException {
        super(art);
        this.prixAchat = prixAchat;
        this.qtAchete = qtAchete;
        mouvementerStock(art, qtAchete);
    }

    @Override
    public String toString() {
        return "Achat{" +
                "prixAchat=" + prixAchat +
                ", qtAchete=" + qtAchete +
                '}';
    }

    @Override
    boolean estMouvementable(){
        if (this.art.getStockMax() < qtAchete) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void mouvementerStock (Article a, int qte) throws QteArticleException{
        if (estMouvementabe()){
            a.setQteStock(qte+a.getQteStock());
        }else {
            throw new QteArticleException(1);
        }
    }


}
