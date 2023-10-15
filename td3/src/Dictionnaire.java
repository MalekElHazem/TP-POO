public class Dictionnaire {
    private int nbMots;
    private MotDico[] dico;
    private String nom;
    Dictionnaire(String nom, int taille)
    {
        this.dico = new MotDico[taille];
        this.nbMots = 0;
        this.nom = nom;
    }

    public void ajouterMot(MotDico m)
    {
        if (nbMots < dico.length)
        {
            dico[nbMots] = m;
            nbMots++;
        }
        else
        {
            System.out.println("Le dictionnaire est plein.");
        }
    }

    public void supprimerMot(String mot)
    {
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].getMot() == mot)
            {
                for (int j = i; j < nbMots - 1; j++) {
                    dico[j] = dico[j + 1];
                }
                dico[nbMots - 1] = null;
                nbMots--;
                System.out.println("Le mot " + mot + " supprime.");
                return;
            }
        }
        System.out.println("Le mot " + mot + " n'existe pas.");
    }


    public int chercherMot(String mot)
    {
        for (int i = 0; i < nbMots; i++)
        {
            if (dico[i].getMot() == mot)
            {
                return i;
            }
        }
        return -1;
    }

    public void listerDico()
    {
        System.out.println("dict " + nom + ":");
        for (int i = 0; i < nbMots; i++)
        {
            MotDico motDico = dico[i];
            System.out.println(motDico.getMot() + " : " + motDico.getDefinition());
        }
    }

    public int nbSynonymes(MotDico m)
    {
        int count = 0;
        for (int i = 0; i < nbMots; i++)
        {
            if (dico[i].synonyme(m))
            {
                count++;
            }
        }
        return count;
    }
}
