package homework6;

public class Programe03instastatic {

    //Declare one instance and one static
    int a = 10;
    static int b = 20;

    //Declare one instance method
    public void abc() {
        System.out.println(a);
        System.out.println(b);

    }
    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the
    public static void abc1() {
        Programe03instastatic obj = new Programe03instastatic();
        System.out.println(obj.a);
        System.out.println(b);
    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme
    public static void main(String[] args) {
        Programe03instastatic obj = new Programe03instastatic();
        obj.abc();
        System.out.println("------------");
        abc1();
    }


}


