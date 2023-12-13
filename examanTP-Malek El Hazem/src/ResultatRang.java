public class ResultatRang implements Resultat {
    private int rang;

    public ResultatRang(int rang) {
        this.rang = rang;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        if (rang > 0) {
            this.rang = rang;
        }
    }

    @Override
    public String toString() {
        return "ResultatRang{" + "rang=" + rang + '}';
    }

    @Override
    public void afficher() {
        System.out.println(this.toString());
    }





    @Override
    public int compareTo(Resultat r) throws IllegalArgumentException {
        if (r instanceof ResultatRang) {
            ResultatRang rr = (ResultatRang) r;
            if (this.rang < rr.rang) {
                return 1;
            } else if (this.rang > rr.rang) {
                return -1;
            } else {
                return  0;
            }
        } else {
            throw new IllegalArgumentException("Resultat must be of type ResultatRang");
        }
    }
}
