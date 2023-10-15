import javax.swing.*;

public class Vehicule {
    private int number;
    private String mark;
    private String model;
    private int annee_creation;
    private double prix;
    private static int count;
    Vehicule (String mark, String model, int annee_creation, double prix)
    {
        count++;
        this.number = count;
        this.mark = mark;
        this.model = model;
        this.annee_creation = annee_creation;
        this.prix = prix;
    }
    void decrisVehicule()
    {
        System.out.println("********************\nNumber :" + number + "\nMark :" + mark + "\nmodel :" + model + "\nAnnee de creation :" + annee_creation + "\nPrix :" + prix);
    }
    public String  getMark()
    {
        return mark;
    }
    public String  getModel()
    {
        return model;
    }
    public double getPrix()
    {
        return prix;
    }

    public int getAnnee_creation() {
        return annee_creation;
    }

    public int getCount() {
        return count;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

}
