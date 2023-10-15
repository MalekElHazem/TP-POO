
public class Main {
    public static void main(String[] args) {
        /*Point p1 = new Point(7,6,'A');
        Point p2 = new Point();
        Point p3 = new Point( p2 );

        p1.affiche();
        p2.affiche();
        p3.affiche();


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        System.out.println(p1==p2);
        System.out.println(p1==p3);

        System.out.println(p1.coincide_V1(p1));
        System.out.println(p1.coincide_V1(p2));


        System.out.println(p1.coincide_V2(p1,p1));
        System.out.println(p1.coincide_V2(p1,p2));*/


        Point p01 = new Point(7,6,'C');
        p01.affiche();
        Cercle c = new Cercle(p01, 5);
        c.affiche();
        /*c.deplacer(1,1);
        c.affiche();*/

        Point p02 = new Point(7,6,'I');
        p02.affiche();
        Cercle i = new Cercle(p02, 5);
        i.affiche();
        System.out.println(c.coincide(c,i));
    }
}