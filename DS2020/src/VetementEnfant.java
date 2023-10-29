public class VetementEnfant extends Vetement {
    private int age;

    VetementEnfant(String lib, float pht, String code, String c, int age) {
        super(lib, pht, code, c);
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        super.toString();
        return "VetementEnfant{" +
                "age=" + age +
                '}';
    }

    float prixTTC(int remise) {
        if (remise >= 50) {
            return -1;
        } else {
            return prixTTC() * (1 - remise / 100);

        }

    }
}