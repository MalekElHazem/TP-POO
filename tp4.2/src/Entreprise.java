public class Entreprise {
    public static void main(String[] args) {
        Salaire tabSalarie[] = new Salaire[5];
        tabSalarie[0] = new Employe(12345, "Walid", 2002, 15,4);
        tabSalarie[1] = new Vendeur(23445, "Yessine", 2007, 1000,0.1);
        tabSalarie[2] = new Vendeur(65478, "Nassime", 2000, 700,0.1);
        tabSalarie[3] = new Employe(87698, "Aymen", 2003, 19,19.5);
        tabSalarie[4] = new Employe(12345, "Khaled", 2008, 7,4);

        System.out.println("********************************Liste des Employes**********************************");
        for ( int i = 0; i < 5; i++)
        {
            if (tabSalarie[i] instanceof Employe)
            {
                tabSalarie[i].afficher();
            }
        }
        System.out.println("*************************************************************************************");

        System.out.println("********************************Liste des Vendeurs**********************************");
        for ( int i = 0; i < 5; i++)
        {
            if (tabSalarie[i] instanceof Vendeur)
            {
                tabSalarie[i].afficher();
            }
        }
        System.out.println("*************************************************************************************");


        System.out.println("********************************Nom du salarié le plus ancien dans l'entreprise**********************************");
        double old = tabSalarie[0].getAnnee_Recroutement();
        int old_index = 0;
        for ( int i = 1; i < 5; i++)
        {
            if (old > tabSalarie[i].getAnnee_Recroutement())
            {
                old = tabSalarie[i].getAnnee_Recroutement();
                old_index = i;
            }
        }
        System.out.println("Nom :" + tabSalarie[old_index].getNom() + "\nannee :" + tabSalarie[old_index].getAnnee_Recroutement());
        System.out.println("*************************************************************************************");


        System.out.println("********************************Matricule du vendeur disposant du plus grand salaire**********************************");
        Salaire sal = null;
        for ( int i = 1; i < 5; i++)
        {
            if (tabSalarie[i] instanceof Vendeur)
            {
                if (sal == null)
                {
                    sal = tabSalarie[i];
                }
                else
                {
                    if (sal.salaire() < tabSalarie[i].salaire())
                    {
                        sal = tabSalarie[i];
                    }
                }
            }

        }
        System.out.println("Matricule :" + sal.getMatricule() + "\nsalaire :" + sal.salaire());
        System.out.println("*************************************************************************************");
    }
}
