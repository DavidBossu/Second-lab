package utm.Task2;

public class Main {

    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone("Samsung", "Alb", 1200, 0.580);
        samsung.setPret(1500);
        samsung.tell();

        Laptop MSI = new Laptop("MSI", "Blue", 2400, 2);
        MSI.setPret(1400);
        MSI.tell();

    }
}
