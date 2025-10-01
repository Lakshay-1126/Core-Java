// Five number max

import java.util.*;

public class NumberMax5 {
    public static void main (String[ ]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
        System.out.println("Enter the value of d");
        int d=sc.nextInt();
        System.out.println("Enter the value of e");
        int e=sc.nextInt();
        if (a>b && a>c && a>d && a>e){
            System.out.println("a is maximum : " + a);
        } else if (b>a && b>c && b>d && b>e){
            System.out.println("b is maximum : " + b);
        } else if (c>a && c>b && c>d && c>e){
            System.out.println("c is maximum : " + c);
        } else if (d>a && d>b && d>c && d> e){
            System.out.println("d is maximum : " + d);
        }
        else{
            System.out.println("e is maximum : " + e);
        }
    }
    
}