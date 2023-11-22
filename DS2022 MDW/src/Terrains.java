public class Terrains extends Carte{
    private String color;

    Terrains (char c) {
        super(0);
        if (c == 'B') {
            this.color = "Blanc";
        } else if (c == 'b'){
            this.color = "bleu";
        } else if (c == 'n'){
            this.color = "noir";
        } else if (c == 'r'){
            this.color = "rouge";
        } else if (c == 'v'){
            this.color = "vert";
        }
    }

    @Override
    public String toString() {
        return " un Terrain " + color ;
    }
}
