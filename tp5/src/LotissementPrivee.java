class LotissementPrivee extends Lotissement {
    LotissementPrivee(int capacite) {
        super(capacite);
    }

    @Override
    public boolean ajouter(Propriete p) {
        if (p instanceof ProprietePrivee) {
            return super.ajouter(p);
        }
        return false;
    }

    @Override
    public ProprietePrivee getProprieteByIndice(int i) {
        Propriete propriete = super.getProprieteByIndice(i);
        if (propriete instanceof ProprietePrivee) {
            return (ProprietePrivee) propriete;
        }
        return null; // La propriété n'est pas privée
    }

    @Override
    public int getNbPieces() {
        int totalPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                totalPieces += ((ProprietePrivee) tabProp[i]).getnbpieces();
            }
        }
        return totalPieces;
    }
}
