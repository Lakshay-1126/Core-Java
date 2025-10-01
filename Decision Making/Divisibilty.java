/* divisible 5 and 11 
	a)num dono se divide ho jb process ho 
	b)num kisi se bhi divide ho jb process ho       */

import java.util.*;

public class Divisibilty {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if (n%5==0 && n%11==0){
            System.out.println("number is divisible by 5 and 11");
        }
        else if (n%5==0 || n%11==0){
            System.out.println("number is divisble either by 5 or 11");
        }
        else {
            System.out.println("number is not divisble by any of them");
        }
    }
    
}