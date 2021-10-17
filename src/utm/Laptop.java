package utm;

public class Laptop {
    private String model;
    private String culoare;
    private int pret;
    private double greutate;

    public Laptop(String model, String culoare, int pret, double greutate){
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
        this.greutate= greutate;
    }

    public void setPret(int pret){
        this.pret = pret;
    }

    public int getPret(){
        return pret;
    }

    public void tell(){
        System.out.println(" Model: " + model + "| Pret: " + getPret() + "| Culoare: " + culoare + "| Greutate" + greutate);
    }


}



