// 1. 34+67+23+12+6
// 2. 23+89+12+56

import java.util.Scanner;

public class AddUserInput2 {
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
        int f = a + b + c + d + e;
        System.out.println("the value of f is " + f);
    }
}