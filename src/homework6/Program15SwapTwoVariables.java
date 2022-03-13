package homework6;

public class Program15SwapTwoVariables {

    public static void main(String[] args) {

        int a, b, temp;
        a = 56;
        b = 78;
        System.out.println("Before swapping : a, b = " + a + ", " + +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + ", " + +b);
    }
}
