public class MotDico {
    private static int Counter = 1;
    private int num;
    private String mot;
    private String definition;

    MotDico(String mot, String definition)
    {
        this.num = Counter;
        Counter++;
        this.mot = mot;
        this.definition = definition;
    }
    public String getMot() {
        return mot;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    boolean synonyme (MotDico m)
    {
        if (this.definition == m.definition)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
