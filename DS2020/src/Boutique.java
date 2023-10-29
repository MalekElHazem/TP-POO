public class Boutique {
    Vetement tabVet[];
    private String nom;
    private int nbVet = 0;

    Boutique (String n, int taille)
    {
        this.nom = n;
        this.tabVet = new Vetement[taille];
    }

    void ajoutVetement (Vetement v) {
        if (nbVet == tabVet.length) {
            System.out.println("Boutique pleine.");
        } else {
            nbVet++;
            tabVet[nbVet] = v;
        }
    }

    void afficheStock (int remise){
        System.out.println("******************************************************");
        for (int i = 0; i < nbVet; i++)
        {
            System.out.println(tabVet[i]);
            //System.out.println(tabVet[i].prixTTC(remise));
            System.out.println();
        }
    }
}
