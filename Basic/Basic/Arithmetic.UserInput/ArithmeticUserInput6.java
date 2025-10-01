// 3.4+1.2*(3.7-1.2)/2+6.8 : By User Input

import java.util.Scanner;

public class ArithmeticUserInput6 {
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
        float f = sc.nextFloat();
        float g = a + b * ( c - d ) / e + f;
        System.out.println("the value of g is " + g);
    }
}