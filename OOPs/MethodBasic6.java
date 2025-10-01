/* no return and argument :

  user input : 

class A:
	add()
	sub()
	div()
	multi() 

class B
	even()

class C 
	odd ()
 */

import java.util.*;
class A{
    void add(int a,int b){
        int c=a+b;
        System.out.print("add" +c +"\n");
    }
    void sub(int a,int b){
        int c=a-b;
        System.out.print("sub" +c +"\n");
    } 
    void multi(int a,int b){
        int c=a*b;
        System.out.print("multi" +c +"\n");
    }
    void div(int a,int b){
        int c=a/b;
        System.out.print("div" +c +"\n");
    }  
}

class B{
    void even(int n){
        if(n%2==0){
            System.out.println("even no.");
        }
    }
}

class C{
    void odd(int n){
        if(n%2!=0){
            System.out.println("odd no.");
        }
    }
}


public class MethodBasic6 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a and b");
    int a=sc.nextInt();
    int b=sc.nextInt();

    A p = new A();
    p.add(a,b);
    p.sub(a,b);
    p.multi(a,b);
    p.div(a,b);

    System.out.println("Enter the value of n");
    int n = sc.nextInt( );

    B q = new B();
    q.even(n);

    C r = new C();
    r.odd(n);
   } 
}