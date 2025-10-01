// Two number max

import java.util.*;
public class NumberMax2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is maximum : " + a);
        }else if(b>a)
        {
                System.out.println("b is maximum : " + b);
            }
        }
    }
    