class Livre {
    private String titre, auteur;
    private float nbPages;
    private double prix;
    private boolean prixFixe = false;
    public Livre (String auteur,String titre)
    {
        this.auteur = auteur;
        this.titre = titre;
    }

    public Livre()
    {
        this.nbPages = 0;
    }

    public Livre (int nb, String titre)
    {
        this.nbPages = nb;
        this.titre = titre;
    }

    public Livre (String auteur, String titre, int nb)
    {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nb;
    }

    public Livre (String auteur, String titre, int nb, double pr)
    {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nb;
        this.prix = pr;
    }

    //getters
    public String getAuteur()
    {
        return auteur;
    }
    public String getTitre()
    {
        return titre;
    }
    public float getNb()
    {
        return nbPages;
    }
    public double getPrix() { return prix; }

    //setters
    public void setAuteur (String aut)
    {
        auteur = aut;
    }
    public void setTitre (String  tit)
    {
        titre = tit;
    }
    public void setNbPages (int nb) {
        if (nb > 20)
        {
            nbPages = nb;
        }
        else
        {
            System.out.println("le nombre est faible.");
        }
    }
    public void setPrix(double pr)
    {
        if (!this.prixFixe)
        {
            prix = pr;
            this.prixFixe = true;
        }
        else
        {
            System.out.println("le prix est fix");
        }
    }

    @Override
    public String toString()
    {
        return ("Livre intitulé " + titre + " de " + auteur + ", contenant " + nbPages + " pages.");
    }

    public void decrire()
    {
        System.out.println("Description: " + this);
    }

    public boolean testPrix()
    {
        if (prix == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}