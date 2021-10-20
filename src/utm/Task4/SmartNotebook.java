package utm.Task4;

public class SmartNotebook extends Electronics{
    double diagonala;

    protected SmartNotebook (String tip, String material, String culoare, int pret, double diagonala){
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
