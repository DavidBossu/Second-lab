package utm.Task4;

public class SmartWatch extends Electronics{
        boolean rezistApa;
    protected SmartWatch (String tip, String material, String culoare, int pret, boolean rezistApa){
        super("AppleWatch", material, culoare, pret);
        this.rezistApa = rezistApa;
    }

    @Override
    public String toString() {
        return  " Tip= " + tip + '\'' +
                ", Material= " + material + '\'' +
                ", Culoare= " + culoare + '\'' +
                ", Pret= " + pret +
                ", Rezistenta la apa= " + rezistApa;
    }
}
