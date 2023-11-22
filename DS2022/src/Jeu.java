public class Jeu {
    long identifiant;
    static int c = 0;
    String nom;
    int annee_sortie;
    int nbr_jeux_salle;
    int age_min;
    private Editeur editeur;

    Jeu(Editeur e){
        this.identifiant = nbr_jeux_salle;
        this.nbr_jeux_salle++;
        this.editeur = e;
    }

    Jeu(String nom, int annee, int ageMin, Editeur edit){
        this.nom =nom;
        this.annee_sortie = annee;
        this.age_min = ageMin;
        //this.Jeu(edit);
    }

    public Editeur getEditeur() {
        return editeur;
    }

    public void setEditeur(Editeur editeur) {
        this.editeur = editeur;
    }

    void decrire(){
        System.out.println("[Jeu id=" + this.identifiant + " name= " + this.nom + "Année d’édition= " + this.annee_sortie + "Age minimum= " + this.age_min + " Editeur= " + this.editeur + " ]");
    }
}
