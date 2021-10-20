package utm.Task3;

public class Main {

    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone("Samsung", "Alb", 0.580, 900);
        samsung.setPret(800);
        System.out.print(samsung.toString());
        System.out.println(samsung.getPret());

        SmartPhone LG = new SmartPhone("lg", "rosu", 2, 700);
        LG.setPret(1200);
        System.out.print(LG.toString());
        System.out.println(LG.getPret());

        S8 samsungS8 = new S8("Samsung_S8", "Alb", 0.580, 800, true, "Are");
        samsungS8.setHusa("Nu are");
        samsungS8.getHusa();
        System.out.println(" ");
        samsungS8.setSticlaProtectoare(false);
        samsungS8.getSticlaProtectoare();
        System.out.println(samsungS8.toString());
    }
}