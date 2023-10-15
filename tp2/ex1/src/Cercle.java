public class Cercle {
    Point p;
    float r;
    Cercle(Point p, float r)
    {
        this.p = p;
        this.r = r;
    }
    void affiche()
    {
        System.out.println("Un Cercle de centre " + p + " et de rayon " + r);

    }
    void deplacer(int a, int b)
    {
        p.deplacer(a,b);
    }
    boolean coincide(Cercle c1,Cercle c2)
    {
        return Point.coincide_V2( c1.p, c2.p ) && c1.r == c2.r;
    }
}
