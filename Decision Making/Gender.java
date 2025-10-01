/* Gender varification by input character
m =  male
f = female 
other */

import java.util.*;

public class Gender {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        if (ch=='m'){
            System.out.println("Male");
        }
            else if (ch=='f'){
                System.out.println("Female");
            }
            else {
                System.out.println("other");
            }
        }
    }
    