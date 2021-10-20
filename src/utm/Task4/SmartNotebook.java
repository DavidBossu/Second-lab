package utm.Task4;

public class SmartNotebook extends Electronics{
    private double diagonala;

    public SmartNotebook (String material, String culoare, int pret, double diagonala){
        super("MSI", material, culoare, pret);
        this.diagonala = diagonala;
    }

    @Override
    public String toString() {
        return  " Tip= " + tip + '\'' +
                ", Material= " + material + '\'' +
                ", Culoare= " + culoare + '\'' +
                ", Pret= " + pret +
                ", Diagonala= " +diagonala;
    }
}
