package homework6;

import java.util.Scanner;

//formula a=PI*r*r
public class Programe06radiusvalue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius: ");

        double radius = scanner.nextDouble();

        System.out.println("Area of the Circle is: "+Math.PI * radius * radius );
    }

}
