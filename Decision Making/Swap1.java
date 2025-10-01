// Swap numbers without third variable

import java.util.*;

public class Swap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
    System.out.println("enter the value of a");
    int a=sc.nextInt();
    System.out.println("enter the value of b");
    int b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("value of a is : "+a+" and value of b is : "+b+" after swapping");

}
}