package utm.Task4;

public class SmartPhone extends Electronics{
    boolean husa;

    protected SmartPhone (String tip, String material, String culoare, int pret, boolean husa){
        super("SamsungS8", material, culoare, pret);
        this.husa = husa;
    }

    @Override
    public String toString() {
        return  " Tip= " + tip + '\'' +
                ", Material= " + material + '\'' +
                ", Culoare= " + culoare + '\'' +
                ", Pret= " + pret +
                ", Husa= " + husa;
    }
}
