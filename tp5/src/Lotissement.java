public class Lotissement implements GestionPropriete {
    protected Propriete [] tabProp;
    protected int nombre;
    Lotissement(int capacite){
        tabProp = new Propriete[capacite];
    }
    Propriete getproprieteByIndice (int i){
        return tabProp[i];
    }
    int getnbPieces(){
        int n = 0;
        for ( int i = 0; i < nombre; i++){
            if( tabProp[i] instanceof ProprietePrivee){
                n++;
            }
        }
        return n;
    }


    public void afficherProprietes() {
        for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i]);
        }
    }

    @Override
    public boolean ajouter(Propriete p) {
        if (nombre < MAX_PROPRIETES) {
            tabProp[nombre++] = p;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean supprimer(Propriete p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].equals(p)) {
                for (int j = i; j < nombre - 1; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                nombre--;
                return true;
            }
        }
        return false;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    Propriete getProprieteByIndice(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        } else {
            return null;
        }
    }

    public int getNbPieces(){
        return 5;
    }
}
