// 1. 45+7
// 2. 45+67

import java.util.Scanner;

public class AddUserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("the value of c is " + c);
    }
}