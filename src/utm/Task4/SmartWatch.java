package utm.Task4;

public class SmartWatch extends Electronics{
    String obiect = "Watch";
    int pret = 800;

    protected SmartWatch (String tip, String material, String culoare){
        super(tip, material, culoare);
    }

    @Override
    public String toString() {
        return "Obiect='" + obiect + '\'' +
                " Tip='" + tip + '\'' +
                ", Material='" + material + '\'' +
                ", Culoare='" + culoare + '\'' +
                ", Pret=" + pret;
    }
}
