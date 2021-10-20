package utm.Task4;

public class SmartPhone extends Electronics{
    private boolean husa;

    public SmartPhone (String material, String culoare, int pret, boolean husa){
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
