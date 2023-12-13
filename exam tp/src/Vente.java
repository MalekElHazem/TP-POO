public class Vente extends OperationStock {
    private double prixVente;
    private int qteVendu;




    Vente(Article art, double prixAchat, int qtAchete) throws QteArticleException {
        super(art);
        this.prixVente = prixAchat;
        this.qteVendu = qtAchete;
        mouvementerStock(art, qtAchete);
    }

    @Override
    public String toString() {
        return "Vente{" +
                "prixVente=" + prixVente +
                ", qteVendu=" + qteVendu +
                '}';
    }

    @Override
    boolean estMouvementable(){
        if (this.art.getStockMax() < qteVendu) {
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
            throw new QteArticleException(2 );
        }
    }


}

