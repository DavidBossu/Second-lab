package utm.Task3;

class Additional extends SmartPhone{
    String sticlaProtectoare = "Are";
    String husa = "Are";
    int pret = 250;

    protected Additional(String model, String culoare, double greutate){
        super(model, culoare, greutate);
        this.pret = pret;
    }


    @Override
    public String toString() {
        return  "  model='" + model + '\'' +
                ", culoare='" + culoare + '\'' +
                ", pret=" + pret +
                ", greutate=" + greutate +
                ", sticlaProtectoare='" + sticlaProtectoare + '\'' +
                ", husa='" + husa + '\'';
    }
}

