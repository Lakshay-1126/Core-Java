// 1. 22/2
// 2. 80/4

import java.util.Scanner;

public class DivideUserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        int c = a / b;
        System.out.println("the value of c is " + c);
    }
}
