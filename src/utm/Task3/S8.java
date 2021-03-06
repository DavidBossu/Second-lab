package utm.Task3;

class S8 extends SmartPhone{
    private boolean sticlaProtectoare;
    private String husa;

    protected S8(String model, String culoare, double greutate,int pret, boolean sticlaProtectoare, String husa){
        super(model, culoare, greutate, pret);
        this.sticlaProtectoare = sticlaProtectoare;
        this.husa = husa;
    }

    public void setSticlaProtectoare(boolean sticlaProtectoare){
        this.sticlaProtectoare = sticlaProtectoare;
    }

    public boolean getSticlaProtectoare(){
        return sticlaProtectoare;
    }

    public void setHusa(String husa){
        this.husa = husa;
    }

    public String getHusa(){
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