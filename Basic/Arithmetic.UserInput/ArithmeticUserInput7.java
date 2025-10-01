// 8.9*1.67-(6.21-5.6)+7.8-34 +157 : By User Input

import java.util.Scanner;

public class ArithmeticUserInput7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        float a = sc.nextFloat();
        System.out.println("enter the value of b");
        float b = sc.nextFloat();
        System.out.println("enter the value of c");
        float c = sc.nextFloat();
        System.out.println("enter the value of d");
        float d = sc.nextFloat();
        System.out.println("enter the value of e");
        float e = sc.nextFloat();
        System.out.println("enter the value of f");
        int f = sc.nextInt();
        System.out.println("enter the value of g");
        int g = sc.nextInt();
        float h = a * b - ( c - d ) + e - f + g;
        System.out.println("the value of h is " + h);
    }
}