package utm.Task2;

    class SmartPhone {
    private String model;
    private String culoare;
    private int pret;
    private double greutate;

    SmartPhone(String model, String culoare, int pret, double greutate){
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
        this.greutate= greutate;
    }

    void setPret(int pret){
        this.pret= pret;
    }

    int getPret(){
        return pret;
    }

    void tell(){
        System.out.println(" Model: " + model + "| Pret: " + getPret() + "| Culoare: " + culoare + "| Greutate" + greutate);
    }
}
