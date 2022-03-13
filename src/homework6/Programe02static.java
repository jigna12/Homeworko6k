package homework6;

public class Programe02static {
    //Declare two static variable
    static int a = 20;
    static int b = 40;

    //Declare one static method
    public static void abc(){

        //call both static variables into static method in print
        System.out.println(a);
        System.out.println(b);
    }
    //Declare the main method
    public static void main(String[] args) {

        //call the static method into main method
        abc();
    }
}
