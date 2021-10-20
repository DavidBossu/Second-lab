package utm.Task4;

public class Main{

    public static void main(String[] args){
        SmartPhone samsung = new SmartPhone("plastic", "Alb", 800, true);
            System.out.println(samsung.toString());
            
        SmartNotebook MSI = new SmartNotebook("plastic", "Albastru", 1200, 15.9);
            System.out.println(MSI.toString());

        SmartWatch AppleWatch = new SmartWatch("plastic", "Alb", 600, true);
             System.out.println(AppleWatch.toString());
    }
}
