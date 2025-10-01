// Char user define method :

import java.util.Scanner;

public class CharUserDefine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character :");
        char b=sc.next().charAt(0);
        System.out.print("Entered character is : " + b);
    }
}