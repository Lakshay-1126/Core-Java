// If the inpute is the integer then check number is divisible by multiple of 7 and 3


import java.util.*;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the integer");
        int n=sc.nextInt();
        if(n%7==0 && n%3==0){
            System.out.println("integer is a multiple of 7 and 3");
        }
        else if (n%7==0 || n%3==1){
            System.out.println(" multiple of 7 ");
        }
        else if (n%3==0 || n%7==1){
            System.out.println("multiple of 3");
        }
        else{
            System.out.println("not a multiple of 7 and 3 ");
        }
    }
    
}
