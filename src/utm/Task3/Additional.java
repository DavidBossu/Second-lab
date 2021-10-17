package utm.Task3;

public class Additional extends SmartPhone{
    String sticlaProtectoare;
    String husa;

    public Additional(String model,String culoare, int pret, double greutate, String sticlaProtectoare, String husa){
        super(model, culoare, pret, greutate);
        this.sticlaProtectoare = sticlaProtectoare;
        this.husa = husa;
    }

    public void customPhone(){
        System.out.println("| Model: " + super.model + "| Culoare: " + super.culoare + "| Pret: "+ super.pret + "| Greutate: " + super.greutate + "| Sticla: " + sticlaProtectoare +"| Husa: " + husa);
    }
}

