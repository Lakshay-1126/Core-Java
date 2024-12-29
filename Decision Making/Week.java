/* number (WEEK DAYS)
1 =>sunday 
2 =>monday 
3 =>tuesday .......
 */

import java.util.*;

public class Week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Sunday");
        }
        else if(n==2){
            System.out.println("Monday");
        }
        else if(n==3){
            System.out.println("Tuesday");
        }
        else if(n==4){
            System.out.println("Wednesday");
        }
        else if(n==5){
            System.out.println("Thursday");
        }
        else if(n==6){
            System.out.println("Friday");
        }
        else if(n==7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("input is not matched");
        }
    }
    
}