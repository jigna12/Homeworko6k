package homework6;

public class Programe01Instance {
    //declaring 2 variable
    int a = 80;
    String name = "Krishna";

    //instance method
    public void xyz(){

        //prime statement
        System.out.println(a);
        System.out.println(name);
    }
    //main method
    public static void main(String[] args) {

        //call instance method into main meythod
        Programe01Instance obj = new Programe01Instance();
        obj.xyz();

    }

}
