// 1.2*6.7-4.5/2 : By User Input

import java.util.Scanner;

public class ArithmeticUserInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        float a = sc.nextFloat();
        System.out.println("enter the value of b");
        float b = sc.nextFloat();
        System.out.println("enter the value of c");
        float c = sc.nextFloat();
        System.out.println("enter the value of d");
        int d = sc.nextInt();
        float e = a * b - c / d;
        System.out.println("the value of e is " + e);
    }
}