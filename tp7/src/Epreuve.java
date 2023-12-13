import java.util.Arrays;

public class Epreuve {
    private String denomination;
    private Candidat tab[];
    private int max;
    private int eff;
    private boolean etat;


    public Epreuve (String denomination, int max) {
        this.denomination = denomination;
        this.max = max;
        this.tab = new Candidat[max];
        this.eff = 0;
    }

    public String getDenomination() {
        return denomination;
    }

    public Candidat[] getTab() {
        return tab;
    }

    public int getEff() {
        return eff;
    }

    public int getMax() {
        return max;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public void setTab(Candidat[] tab) {
        this.tab = tab;
    }

    public void setEff(int eff) {
        this.eff = eff;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }


    @Override
    public String toString() {
        return "Epreuve{" +
                "denomination='" + denomination + '\'' +
                ", tab=" + Arrays.toString(tab) +
                ", etat=" + etat +
                '}';
    }

    void ajoutCandidat(Candidat c){
        if (!etat && eff > max){
            tab[eff] = c;
            eff++;
        }
    }

    void terminer (){
        setEtat(true);
    }

    boolean estTerminee(){
        if (this.etat){
            return true;
        }else {
            return false;
        }
    }

    Resultat getRecord(){
        if (eff == 0) {
            return null;
        }
        Resultat best = tab[0].getResultat();
        int max = 0;
        for (int i = 1; i < tab.length;i++){
            if (best.compareTo(tab[i].getResultat()) == 0)
            {
                best = tab[i].getResultat();
                max = i;
            }
        }
        return best;
    }

    Candidat getVinqueur(){
        if (eff == 0) {
            return null;
        }
        Resultat best = tab[0].getResultat();
        int max = 0;
        for (int i = 1; i < tab.length;i++){
            if (best.compareTo(tab[i].getResultat()) == 0)
            {
                best = tab[i].getResultat();
                max = i;
            }
        }
        return tab[max];
    }

    void fixeResultat(int id, Resultat r) throws IllegalUpdateException {
        if (this.etat) {
            throw new IllegalUpdateException("Cannot update result. The event has ended.");
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != null && tab[i].getId() == id) {
                tab[i].setResultat(r);
                return;
            }
        }
    }

    Resultat getResultat(int id){
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != null && tab[i].getId() == id) {
                return tab[i].getResultat();
            }
        }
        return null;
    }
}
