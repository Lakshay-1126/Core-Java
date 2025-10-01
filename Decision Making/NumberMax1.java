// One number max a>10

import java.util.Scanner;

public class NumberMax1 {
   public static void main(String [ ]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter one number");
    int a=sc.nextInt();
    if(a>10){
        System.out.print("a is greater than 10");
       } 
    else{
        System.out.print("a is not greater than 10");
      }
   }
}