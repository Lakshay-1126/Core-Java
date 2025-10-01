/* no return and argument 
A :
	method one 
B:
	method one 
C:
	method three
D:
	method four   */

class A{
    void display(int a ){
        System.out.println("value of a : " +a);
    }
    }
    
    class B{
    void replay(int c ){
        System.out.println("value : " +c);
    }
    void replay2(int m ){
        System.out.println("value : " +m);
    }
    }
    
    class C{
        void display1(int x ){
            System.out.println("value of x : " +x);
        }
        void display2(int y ){
            System.out.println("value of y : " +y);
        }
        void display3( int z){
            System.out.println("value of z : " +z);
        }
    }
    
    class D{
         void show(int x ){
            System.out.println("value of x : " +x);
         }
         void show2(int y ){
            System.out.println("value of y : " +y);
         }
         void show3(int z ){
            System.out.println("value of z : " +z);
         }
         }
    
    
       public class MethodBasic5 {
        public static void main(String[] args) {
          A a=new A( );
          a.display(2);
          
          B b=new B( );
          b.replay(4);
          b.replay2(5);
    
          C x=new C( );
          x.display1(7);
          x.display2(8);
          x.display3(9);
    
          D y=new D( );
          y.show(13);
          y.show2(12);
          y.show3(11);
        
        }
    }
    