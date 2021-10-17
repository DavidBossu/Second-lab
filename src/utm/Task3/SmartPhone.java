package utm.Task3;

    class SmartPhone {
    public String model;
    public String culoare;
    public int pret;
    public double greutate;

    SmartPhone(String model, String culoare, int pret, double greutate){
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
        this.greutate= greutate;
    }


    int getPret(){
        return pret;
    }

    void tell(){
        System.out.println(" Model: " + model + "| Pret: " + getPret() + "| Culoare: " + culoare + "| Greutate" + greutate);
    }

}
