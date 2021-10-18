package utm.Task4;

public class SmartPhone extends Electronics{
    String obiect = "Phone";
    int pret = 1000;

    protected SmartPhone (String tip, String material, String culoare){
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
