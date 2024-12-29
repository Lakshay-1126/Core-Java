/* vowel and consonat 
->a e i o u vowel 
consonant  */

import java.util.*;
public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("entered character is a vowel");
        }
        else  {
            System.out.println("entered character is a consonant");
        }
    }
    
}
