// 1.6*(12-2)/2+7.8-1.5 : By User Input

import java.util.Scanner;

public class ArithmeticUserInput3 {
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
        System.out.println("enter the value of e");
        float e = sc.nextFloat();
        System.out.println("enter the value of f");
        float f = sc.nextFloat();
        float g = a * ( b - c ) / d + e - f;
        System.out.println("the value of g is " + g);
    }
}