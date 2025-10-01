/* character match 
a =>apple 
b :ball 
c :cat 
not match  */

import java.util.*;

public class CharMatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        if (ch=='a'){
            System.out.println("apple");
        } 
        else if (ch=='b'){
        System.out.println("ball");
    }
        else if (ch=='c'){
            System.out.println("cat");
        }
        else{
            System.out.println("input is not matched");
        }
    }
    
}