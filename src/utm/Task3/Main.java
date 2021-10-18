package utm.Task3;

public class Main {

    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone("Samsung", "Alb", 0.580);
        samsung.setPret(800);
        System.out.println(samsung.toString());

        SmartPhone LG = new SmartPhone("lg", "rosu", 2);
        LG.setPret(1200);
        System.out.println(LG.toString());

        SmartPhone samsungS8 = new Additional("Samsung_S8", "Alb", 0.580);
        System.out.println(samsungS8.toString());
    }
}