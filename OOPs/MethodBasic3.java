/* A :
	method one 
B:
	method one 
C:
	method three
D:
	method four     */

class A{
    void display( ){
        System.out.println("first method");
    }
    }
    class B{
    void replay( ){
        System.out.println("method one");
    }
    void replay2( ){
        System.out.println("method two");
    }
    }
    class C{
        void display1( ){
            System.out.println("method1");
        }
        void display2( ){
            System.out.println("method2");
        }
        void display3( ){
            System.out.println("method3");
        }
    }
    class D{
         void show( ){
            System.out.println("hello world");
         }
         void show2( ){
            System.out.println("hello Asia");
         }
         void show3( ){
            System.out.println("hello India");
         }
         void show4( ){
            System.out.println("hello Jaipur");
         }
    }
    public class MethodBasic3 {
        public static void main(String[] args) {
          A a=new A( );
          a.display( );
          
          B b=new B( );
          b.replay( );
          b.replay2( );
          C x=new C( );
          x.display1();
          x.display2();
          x.display3();
          D y=new D( );
          y.show( );
          y.show2();
          y.show3();
          y.show4();
        }
    }