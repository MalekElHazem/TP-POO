public class Magic {
    public static void main(String[] args) {
        Jeu maMain = new Jeu(10);
        Terrains t = new Terrains('B');
        maMain.ajouter(t);
        Creature c = new Creature(6, " Gobelin", 4, 6);
        maMain.ajouter(c);
        Sortileges s=new Sortileges(1, "Amplificatum","Il augmente la taille de l'objet ou de l'animal visé");
        maMain.ajouter(s);
        System.out.println("Là, j'ai en stock :");
        maMain.affiche();
        maMain.jouer();
        maMain.jouer();
    } }
