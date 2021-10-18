package utm.Task4;

public class SmartNotebook extends Electronics{
    String obiect = "Notebook";
    int pret = 1200;

    protected SmartNotebook (String tip, String material, String culoare){
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
