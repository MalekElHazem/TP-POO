// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PointCol pointColor = new PointCol(3, 4, 'A', "Rouge");

        pointColor.affiche();

        pointColor.setCouleur("Bleu");
        pointColor.affiche();

        Point point = new Point(1, 1, 'B');
        PointCol pointCol2 = new PointCol(2, 2, 'C', "Vert");


        pointCol2 = (PointCol) point;

    }
}