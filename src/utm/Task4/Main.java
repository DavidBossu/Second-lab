package utm.Task4;

public class Main{

    public static void main(String[] args){
        Electronics[] arr = new Electronics[] {new SmartPhone(), new SmartNotebook(), new SmartWatch()};
        for(int i = 0; i<arr.length; i++)
            arr[i].tell();
    }
}
