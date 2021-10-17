package utm.Task3;

public class Main {

    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone("Samsung", "Alb", 1200, 0.580);
        samsung.tell();

        SmartPhone LG = new SmartPhone("lg", "rosu", 100, 2);
        LG.tell();

        Additional samsungS8 = new Additional("Samsung_S8", "Alb", 1200, 0.580,"Are","Are");
        samsungS8.customPhone();
    }
}