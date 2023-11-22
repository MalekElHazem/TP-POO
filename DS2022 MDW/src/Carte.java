public class Carte {
    protected int cout;

    Carte(int cout)
    {
        this.cout = cout;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "cout=" + cout +
                '}';
    }
}
