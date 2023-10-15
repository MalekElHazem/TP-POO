
public class CalculMoyenne {
    public static void main(String[] args) {
        int nb = 3;
        float[] noteCtrl = new float[nb];
        float[] noteExam = new float[nb];
        Tab tab = new Tab();
        tab.remplir(noteCtrl);
        tab.lister(noteCtrl);

        tab.remplir(noteExam);
        tab.lister(noteExam);

        float[] moyenne;
        moyenne = tab.additionner(noteCtrl , (tab.produit(2,noteExam)));
        for (int i = 0; i < moyenne.length; i++)
        {
            moyenne[i] = moyenne[i] / 3;
        }
        System.out.println("Moyenne d'etudiant :");
        tab.lister(moyenne);
        System.out.println("Moyenne du classe :");
        System.out.println(tab.somme_element(moyenne) / 3);



        System.out.println("note Exam :");
        tab.lister(noteExam);

        float[] noteExamadd;
        noteExamadd = tab.add(1,noteExam);
        System.out.println("note Exam :");
        tab.lister(noteExamadd);
    }
}