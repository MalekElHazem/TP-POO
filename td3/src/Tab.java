import java.util.Scanner;

public class Tab {
    static int NMAX = 40;
    Tab()
    {
        this.NMAX = 40;
    }
    static void remplir (float t[])
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < t.length; i++)
        {
            System.out.println("t" + i + " :");
            float x = scanner.nextFloat();
            t[i] = x;
        }

    }
    static float somme_element (float t[])
    {
        float sum = 0;
        for (int i = 0; i < t.length; i++)
        {
            sum += t[i];
        }
        return sum;
    }

    static float[] additionner (float t1[], float t2[])
    {
        int max;
        if (t1.length > t2.length)
        {
            max = t1.length;
        }
        else
        {
            max = t2.length;
        }
        float[] t = new float[max];
        for (int i = 0; i < max; i++)
        {
            t[i] = t1[i] + t2[i];
        }
        return t;
    }

    static float[] produit (float x, float t[])
    {
        float[] t1 = new float[t.length];
        for (int i = 0; i < t1.length; i++)
        {
            t1[i] = t[i] * x;
        }
        return t1;
    }

    static void lister (float t[])
    {
        for (int i = 0; i < t.length; i++)
        {
            System.out.println("t" + i + " = " + t[i]);
        }
    }

}
