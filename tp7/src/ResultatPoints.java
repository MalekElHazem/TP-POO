public class ResultatPoints implements Resultat {
    private int points;

    public ResultatPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Points : " + points;
    }

    @Override
    public int compareTo(Resultat r) {
        if (!(r instanceof ResultatPoints)) {
            throw new IllegalArgumentException("Le résultat n'est pas de même nature");
        }

        ResultatPoints other = (ResultatPoints) r;
        return Integer.compare(points, other.getPoints());
    }
}
