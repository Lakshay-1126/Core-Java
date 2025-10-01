// Swap numbers using third variable

import java.util.*;

public class Swap2 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the value of a");
    int a=sc.nextInt();
    System.out.println("enter the value of b");
    int b=sc.nextInt();
     int c;
     c=a;
     a=b;
     b=c;
     System.out.println("swapped value of a is : "+a+" and swapped value of b is : "+b+" ");
}    
}