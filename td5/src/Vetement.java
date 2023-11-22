import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Vetement extends Article implements Promotion {
    private String couleur;
    private String taille;

    public Vetement(long ref, String lib, float p, int q, String couleur, String taille) {
        super(ref, lib, p, q);
        this.couleur = couleur;
        this.taille = taille;
    }

    @Override
    public float calculPrixTTC() {
        if (estPeriodePromo(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))) {
            return prixHT * (1 + TVA) * 0.7f;
        } else {
            return prixHT * (1 + TVA);
        }
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Classe : Vetement");
        System.out.println("Couleur : " + couleur);
        System.out.println("Taille : " + taille);
    }

    @Override
    public float prixDeVente(String dateStr) {
        if (estPeriodePromo(dateStr)) {
            return calculPrixTTC() * 0.8f; // 20% de remise supplémentaire pendant la promotion
        } else {
            return calculPrixTTC();
        }
    }
}