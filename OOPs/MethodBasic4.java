/* user input : 

class A:
	add()
	sub()
	div()
	multi() 

class B
	even()

class C 
	odd ()  */

import java.util.*;

class A{
    void add( ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition");

        System.out.println("Enter the value of a and b\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum=" +c);
    }
  void sub( ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Subtraction");
        
        System.out.println("Enter the value of a and b\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a-b;
        System.out.println("Sub=" +c);
    }
    void multi( ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Multiplication");

        System.out.println("Enter the value of a and b\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        System.out.println("Product=" +c);
    }
    void div( ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Division");
        System.out.println("Enter the value of a and b\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Div=" +c);
    }
    }
    
    class B{
    void even( ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Even number");
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Number is even");
        }
    }
    }
    
    
    class C{
        void odd( ){
            Scanner sc=new Scanner(System.in);
            System.out.println("Odd number");
            System.out.println("Enter a number");
            int a=sc.nextInt();
            if (a%2!=0){
                System.out.println("Number is odd");
            }
        }
    
    }
public class MethodBasic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        A sub=new A();
        sub.add();
        sub.sub();
        sub.multi();
        sub.div();
        B sub1=new B();
        sub1.even();
        C sub2=new C();
        sub2.odd();    
    }
}