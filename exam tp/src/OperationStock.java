public abstract class OperationStock implements MouvementStock {
    protected int idOp;
    protected Article art;

    OperationStock(Article art){
        this.idOp = 0;
        this.art = art;
    }

    @Override
    public String toString() {
        return "OperationStock{" +
                "idOp=" + idOp +
                ", art=" + art +
                '}';
    }

    @Override
    public boolean estMouvementabe() {
        return false;
    }

    @Override
    public void mouvementerStock(Article a, int qte) throws QteArticleException {

    }


    abstract boolean estMouvementable();

    public int getPrixUnitaire() {
        return 0;
    }

    public int getQte() {
        return 0;
    }
}
