import java.util.Scanner;
public class TestCompte {
    int n;
    Compte[] comptes;
    Personne[] presonnage;
    TestCompte(int num)
    {
        this.n = num;
        this.comptes = new Compte[num];
        this.presonnage = new Personne[num];
        for (int i = 0; i < n; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nom: ");
            String nom = scanner.nextLine();

            System.out.println("Prenom: ");
            String prenom = scanner.nextLine();

            System.out.println("Adresse: ");
            String adresse = scanner.nextLine();

            this.presonnage[i] = new Personne(nom, prenom, adresse);
            this.comptes[i] = new Compte(this.presonnage[i]);

        }
    }

    void afficher()
    {
        System.out.println("----------------------------------------------");
        for (int i = 0; i < n; i++)
        {
            System.out.println(comptes[i]);
        }
    }

    void afficher_solde_elve()
    {
        int max_index = 0;
        double max = this.comptes[0].getSolde();
        for (int i = 1; i < n; i++)
        {
            if (this.comptes[i].getSolde() > max)
            {
                max =this.comptes[i].getSolde();
                max_index = i;
            }
        }
        System.out.println(this.comptes[max_index]);
    }
}
