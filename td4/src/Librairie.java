public class Librairie {
    private Livre[] liste;
    private int capacite;
    private int nb;

    public Librairie(int capacite)
    {
        this.capacite = capacite;
        this.liste = new Livre[capacite];
        this.nb = 0;
    }


    public int getNb()
    {
        return nb;
    }


    public void inventaire()
    {
        System.out.println("Inventaire de la librairie:");
        for (int i = 0; i < nb; i++)
        {
            Livre livre = liste[i];
            System.out.println(livre.toString() + " - Prix: " + livre.calculePrix());
        }
    }



    public void inventaire(String categ)
    {
        System.out.println("Livres de la catégorie " + categ + " dans la librairie:");
        for (int i = 0; i < nb; i++)
        {
            Livre livre = liste[i];
            if (livre instanceof Roman && categ.equals("Roman"))
            {
                System.out.println(livre.toString() + " - Prix: " + livre.calculePrix());
            }
            else if (livre instanceof Magazine && categ.equals("Magazine"))
            {
                System.out.println(livre.toString() + " - Prix: " + livre.calculePrix());
            }
        }
    }

    public void ajoutLiv(Livre liv)
    {
        if (nb < capacite)
        {
            liste[nb] = liv;
            nb++;
        }
        else
        {
            System.out.println("La librairie est pleine, impossible d'ajouter plus de livres.");
        }
    }



    public void suppLiv(int num)
    {
        int index = -1;
        for (int i = 0; i < nb; i++)
        {
            if (liste[i].getIdentifiant() == num) {
                index = i;
                break;
            }
        }

        if (index != -1)
        {
            for (int i = index; i < nb - 1; i++) {
                liste[i] = liste[i + 1];
            }
            liste[nb - 1] = null;
            nb--;
            System.out.println("Livre d'identifiant " + num + " supprimé de la librairie.");
        }
        else
        {
            System.out.println("Livre d'identifiant " + num + " n'existe pas dans la librairie.");
        }
    }

    public Livre[] getListe() {
        return liste;
    }
}
