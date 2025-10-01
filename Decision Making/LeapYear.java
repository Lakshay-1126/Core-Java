// Condition for a leap year 

public class LeapYear {
    public static void main(String[] args) {
       int year=2008;
       System.out.println("year : " +year);
       if(year%4==0 && year%400==0 || year%100!=0){
         System.out.println("Leap year");
     }
     else{
         System.out.println("Not a leap year");
     }
    }   
   }