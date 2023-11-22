public class Jeu {
    Carte TabCartes[];
    int nb = 0;

    Jeu (int nb){
        if(nb<=10) {
            TabCartes = new Carte[nb];
            System.out.println("on change de main");
        }
    }

    void ajouter(Carte c){
        if (this.nb == TabCartes.length) {
            System.out.println("Full Table.");
        } else {
            TabCartes[nb] = c;
            nb++;
            if (c.getClass().getSimpleName() == "Terrains") {
                System.out.println("Un nouveau terrain.");
            } else if (c.getClass().getSimpleName() == "Creature") {
                System.out.println("Une nouvelle créature.");
            } else if (c.getClass().getSimpleName() == "Sortileges") {
                System.out.println("Un sortilège de plus.");
            }
        }
    }

    void jouer(){
        System.out.println("Je joue une carte...");
        System.out.println("La carte jouée est :");
        for ( int i = 0; i < nb; i++)
        {
            if (TabCartes[i] != null)
            {
                //System.out.println("Un");
                System.out.println(TabCartes[i]);
                TabCartes[i] = null;
                return;
            }
        }
    }

    void affiche(){
        for ( int i = 0; i < nb; i++)
        {
            if (TabCartes[i] != null)
            {
                //System.out.println("Un");
                System.out.println(TabCartes[i]);
            }
        }
    }
}
