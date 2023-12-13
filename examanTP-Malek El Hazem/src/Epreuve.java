
public class Epreuve {
    private String denomination;
    private Athlete tab[];
    private int max;
    private int eff;
    private boolean etat;

    public Epreuve(String denomination, int max){
        this.denomination = denomination;
        this.max = max;
        tab = new Athlete[max];
        eff = 0;
        etat = false;
    }
    
    public String getDenomination() {
        return denomination;
    }

    public Athlete[] getTab() {
        return tab;
    }

    public int getMax() {
        return max;
    }

    public int getEff() {
        return eff;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public void setTab(Athlete[] tab) {
        this.tab = tab;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setEff(int eff) {
        this.eff = eff;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String toString(){
        String s = "Epreuve : " + denomination + "\n";
        for(int i = 0; i < eff; i++){
            s += tab[i].getNom() + "\n";
        }
        if(etat){
            s += "Epreuve terminee";
        }else{
            s += "Epreuve non terminee";
        }
        return s;
    }

    public boolean ajouterAthlete(Athlete a){
        if(eff < max && !etat){
            tab[eff] = a;
            eff++;
            return true;
        }
        return false;
    }

    void terminer(){
        if(!etat){
            etat = true;
        }
    }

    boolean estTerminee(){
        return etat;
    }





    Resultat getRecordOlymique() throws IllegalArgumentException{
        if(etat){
            Resultat r = tab[0].getResultat();
            for(int i = 1; i < eff; i++){
                if(tab[i].getResultat().compareTo(r) == 1){
                    r = tab[i].getResultat();
                }
            }
            return r;
        }
        return null;
    }





    Athlete getVinqueur() {
        if(etat){
            Resultat r = tab[0].getResultat();
            int index = 0;
            for(int i = 1; i < eff; i++){
                if(tab[i].getResultat().compareTo(r) == 1){
                    r = tab[i].getResultat();
                    index = i;
                }
            }
            return tab[index];
        }
        return null;
    }






    void fixeResultat(int id, Resultat r) throws InvalidStateException{
        if(!etat){
            boolean found = false;
            for(int i = 0; i < eff; i++)
            {
                if(tab[i].getId() == id)
                {
                    tab[i].setResultat(r);
                    return;
                }
            }
        }
        else {
            throw new InvalidStateException("Epreuve terminee");
        }
    }






    Resultat getResultat(int id){
        for(int i = 0; i < eff; i++)
        {
            if(tab[i].getId() == id)
            {
                if (tab[i].getResultat() != null){
                    return tab[i].getResultat();
                }
                else{
                    return null;
                }
            }
        }
        return null;
    }


}
