package homework6;

public class Programe04instastatic2 {
    //4.1Declare two instance and two static variable
    int a = 10;//instance variable
    String name = "Mina";//instance variable

    static int b = 20;//static variable
    static String  xyz = "Patel";//static variable

    //4.2 Declare one instance method
    public void test(){
        System.out.println(a);
        System.out.println(name);
        System.out.println(b);
        System.out.println(xyz);
    }
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    //print statement.
    public static void test1(){
        Programe04instastatic2 obj = new Programe04instastatic2();
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(b);
        System.out.println(xyz);
    }

    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programe04instastatic2 obj = new Programe04instastatic2();
        obj.test();
        test1();

    }
}

