
public class Main {
    public static void main(String[] args) {
        int nb = 3;
        float[] noteCtrl = new float[nb];
        float[] noteExam = new float[nb];
        Tab tab = new Tab();
        tab.remplir(noteCtrl);
        tab.lister(noteCtrl);

        tab.remplir(noteExam);
        tab.lister(noteExam);

        float[] moyenne = new float[nb];
        moyenne = tab.additionner(noteCtrl , (tab.produit(2,noteExam)));
        tab.lister(moyenne);
        System.out.println(tab.somme_element(moyenne));
    }
}