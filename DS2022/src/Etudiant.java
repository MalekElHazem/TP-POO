public class Etudiant {
    String nom, prenom;
    public Etudiant(String n, String p) {
        nom=n;
        prenom=p;
    }

    public static void main(String[] args) {
        Etudiant e = new Etudiant("Nada", "Ben Salah");
        Etudiant f = new Etudiant("Nada", "Ben Salah");
        System.out.println(e==f);
        System.out.println(e.equals(f));
    }
}
