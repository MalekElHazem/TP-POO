public class PointCol extends Point {
    private String couleur;

    public PointCol() {
        super();
        this.couleur = "Noir";
    }

    public PointCol(int abs, int ord, char name, String couleur) {
        super(abs, ord, name);
        this.couleur = couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public void affiche() {
        System.out.println(name + "(" + abs + "," + ord + ") de couleur " + couleur);
    }
}
