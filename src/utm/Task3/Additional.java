package utm.Task3;

class S8 extends SmartPhone{
    boolean sticlaProtectoare;
    String husa;

    protected S8(String model, String culoare, double greutate,int pret, boolean sticlaProtectoare, String husa){
        super(model, culoare, greutate, pret);
        this.sticlaProtectoare = sticlaProtectoare;
        this.husa = husa;
    }
    void setSticlaProtectoare(boolean sticlaProtectoare){
        this.sticlaProtectoare = sticlaProtectoare;
    }

    boolean getSticlaProtectoare(){
        return sticlaProtectoare;
    }

    void setHusa(String husa){
        this.husa = husa;
    }

    String getHusa(){
        return husa;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", sticlaProtectoare= " + sticlaProtectoare +
                ", husa= " + husa +
                ", pret= " + pret;
    }
}