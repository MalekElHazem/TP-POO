public class Stock {
    OperationStock[] tabOp;
    int nbOp = 0;


    public Stock(int taille) {
        tabOp = new OperationStock[taille];
    }

    public void ajouterOperation(OperationStock op) {
        tabOp[nbOp] = op;
        nbOp++;
    }

    public void afficher() {
        for (int i = 0; i < nbOp; i++) {
            System.out.println(tabOp[i]);
        }
    }

    public void afficherVentes() {
        for (int i = 0; i < nbOp; i++) {
            if (tabOp[i] instanceof Vente) {
                System.out.println(tabOp[i]);
            }
        }
    }

    public void afficherAchats() {
        for (int i = 0; i < nbOp; i++) {
            if (tabOp[i] instanceof Achat) {
                System.out.println(tabOp[i]);
            }
        }
    }

    public void afficherMouvement() {
        for (int i = 0; i < nbOp; i++) {
            if (tabOp[i].estMouvementabe()) {
                System.out.println(tabOp[i]);
            }
        }
    }

    public double meilleurPrixVente(Article a) {
        double max = 0;
        for (int i = 0; i < nbOp; i++) {
            if (tabOp[i] instanceof Vente) {
                if (tabOp[i].getArt().equals(a)) {
                    if (tabOp[i].getPrixVente() > max) {
                        max = tabOp[i].getPrixVente();
                    }
                }
            }
        }
        return max;
    }

    public void addOperation(Achat achat) {
    }
        
}
