package iset.dsi2.animalerie;

public class TestHeritage {
    public static void main(String[] args) {
        Animal[] T = new Animal[3];


        T[0] = new Animal("Gris", 10);


        T[1] = new Chat("Noir", 10, true);


        T[2] = new Chien("Marron", 10, "Labrador");

        for (int i = 0; i < T.length; i++) {

            System.out.println("**************************************************************************************************************************************************");

            T[i].decrisToi();


            T[i].manger();
            T[i].boire();
            T[i].crier();


            if (T[i] instanceof Animal) {
                System.out.println("L'espèce de cet animal est inconnue.");
            }

            System.out.println();
        }
    }
}
