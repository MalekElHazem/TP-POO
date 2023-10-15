public class Main {
    public static void main(String[] args) {
        Dictionnaire dico = new Dictionnaire("Larousse", 10);

        MotDico mot1 = new MotDico("chat", "animal domestique");
        MotDico mot2 = new MotDico("chien", "meilleur ami de l'homme");
        MotDico mot3 = new MotDico("tiger", "animal domestique");

        dico.ajouterMot(mot1);
        dico.ajouterMot(mot2);
        dico.ajouterMot(mot3);

        dico.listerDico();

        System.out.println("Position de 'azz' dans le dictionnaire: " + dico.chercherMot("azz"));
        System.out.println("Position de 'chien' dans le dictionnaire: " + dico.chercherMot(mot2.getMot()));
        System.out.println(mot2.getMot() + " : " + mot2.getDefinition());



        System.out.println("Nombre de synonymes de 'chat': " + dico.nbSynonymes(mot1));


        dico.supprimerMot("chat");

        dico.listerDico();
    }
}




