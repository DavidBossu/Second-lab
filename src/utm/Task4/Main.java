package utm.Task4;

public class Main{

    public static void main(String[] args){
        Electronics samsung = new SmartPhone("nou", "plastic", "Alb", "Telefon");
            System.out.println(samsung.toString());
            
        Electronics MSI = new SmartNotebook("nou","plastic", "Albastru", "Laptop");
            System.out.println(MSI.toString());

        Electronics AppleWatch = new SmartWatch("uzat", "plastic", "Alb");
             System.out.println(AppleWatch.toString());
    }
}
