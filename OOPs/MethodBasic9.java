/* return and no argument :
A class
	covariant return type 
	welcome to india 
 */

class A {
    A show(){
        System.out.println("Welcome to India");
        return this;
    }
}
public class MethodBasic9 {
    public static void main(String[] args) {
        A a=new A();
        a.show( );
    }
}