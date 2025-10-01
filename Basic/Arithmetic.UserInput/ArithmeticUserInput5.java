// 8*1+(4-2)/1+6 : By User Input

import java.util.Scanner;

public class ArithmeticUserInput5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the value of c");
        int c = sc.nextInt();
        System.out.println("enter the value of d");
        int d = sc.nextInt();
        System.out.println("enter the value of e");
        int e = sc.nextInt();
        System.out.println("enter the value of f");
        int f = sc.nextInt();
        int g = a * b + ( c - d ) / e + f;
        System.out.println("the value of g is " + g);
    }
}