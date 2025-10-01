/* user :
-9 negative integer 
5 positive integer 
0 =zero 
 */

import java.util.*;

public class UserInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int a=sc.nextInt();
        if (a== -9){
            System.out.println("entered integer is negative");
        }
        else if (a==5){
            System.out.println("entered integer is positive");
        }
        else if (a==0){
            System.out.println("entered interger is zero");
        }
        else {
            System.out.println("input is not matched");
        }


      }
    
}