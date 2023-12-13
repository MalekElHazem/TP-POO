public class ResultatOral implements Resultat {
    private Character res;

    ResultatOral(Character c){
        this.res = c;
    }

    public Character getRes() {
        return res;
    }

    public void setRes(Character res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "R :" + res;
    }

    @Override
    public int compareTo(Resultat r) {
        if ( r instanceof ResultatOral) {
            ResultatOral temp = (ResultatOral) r;
            if (this.res == temp.res) {
                return 0;
            } else if (this.res == 'A' || (this.res == 'B' && temp.res == 'C')) {
                return 1;
            }else {
                return -1;
            }
        }
        else {
            throw new IllegalArgumentException("Resultat n'est pas le meme nature.");
        }
    }
}
