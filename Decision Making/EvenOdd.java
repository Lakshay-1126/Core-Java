// By user input check number is even or odd

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }
        else if(n%2==1){
            System.out.println("Odd number");
        }
    }
}