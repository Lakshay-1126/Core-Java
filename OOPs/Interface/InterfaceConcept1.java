/* interface A
	method :return and argument 

interface B 
	method :no return and argument 

interface C
	method :return and no argument 

interface D
	method :no return and no argument 

class : implement using exteds interface  */

interface A {
    int methodA(int x);
}

interface B {
    void methodB(int x);
}

interface C {
    int methodC();
}

interface D {
    void methodD();
}

class MyClass implements A, B, C, D {
   
    public int methodA(int x) {
        return x * 2;
    }

  
    public void methodB(int x) {
        System.out.println("Method B: " + x);
    }

 
    public int methodC() {
        return 42;
    }

 
    public void methodD() {
        System.out.println("Method D: No return, no argument");
    }
}

public class InterfaceConcept1 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        int resultA = myClass.methodA(5);
        System.out.println("Result from method A: " + resultA);

        myClass.methodB(10);

        int resultC = myClass.methodC();
        System.out.println("Result from method C: " + resultC);

        myClass.methodD();
    }
}