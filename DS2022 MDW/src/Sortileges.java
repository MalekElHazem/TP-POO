public class Sortileges extends Carte{
    private String name;
    private String description;

    Sortileges(int cout, String name, String description)
    {
        super(cout);
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Sortileges{" +
                "name='" + name + '\'' ;
    }
}
