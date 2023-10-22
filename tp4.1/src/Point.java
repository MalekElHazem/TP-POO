public class Point {
    int abs;
    int ord;
    char name;

    Point (int abs, int ord, char name)
    {
        this.abs = abs;
        this.ord = ord;
        this.name = name;
    }
    Point ()
    {
        abs = 0;
        ord = 0;
        name = 'O';
    }

    Point (Point p)
    {
        abs = p.abs;
        ord = p.ord;
        name = p.name;
    }

    public void affiche () {
        System.out.println(name + "(" + abs + "," + ord + ")");

    }

    void deplacer (int xa, int xb)
    {
        abs += xa;
        ord += xb;
    }

    void reset()
    {
        abs = 0;
        ord = 0;
    }

    @Override
    public String toString()
    {
        return name + "(" + abs + "," + ord + ")";
    }


    public boolean coincide_V1(Point p) {
        return this.abs == p.abs && this.ord == p.ord;
    }

    public static boolean coincide_V2(Point a, Point b) {
        return a.abs == b.abs && a.ord == b.ord;
    }
}
