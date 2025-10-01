/* interface A
	private method :return and argument 

interface B ex A
	default method :no return and argument 

interface C ex B
	method :return and no argument 

	interface :method 

interface D ex C
	method :no return and no argument 
	class : 

class : access 
 */
interface A {
    private int privateMethod(int x) {
        return x * 2;
    }

    default int accessPrivateMethod(int x) {
        return privateMethod(x);
    }
}

interface B extends A {
    default void defaultMethod(int x) {
        System.out.println("Default Method B: " + x);
    }
}

interface C extends B {
    int methodWithReturnAndNoArgument();

    interface NestedInterface {
        void nestedMethod();
    }
}

interface D extends C {
    void methodWithNoReturnAndNoArgument();
}

class MyClass implements D, C.NestedInterface {
    @Override
    public int methodWithReturnAndNoArgument() {
        return 42;
    }

    @Override
    public void methodWithNoReturnAndNoArgument() {
        System.out.println("Method D: No return, no argument");
    }

    @Override
    public void nestedMethod() {
        System.out.println("Nested Interface Method");
    }
}

public class InterfaceConcept2 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        int resultA = myClass.accessPrivateMethod(5);
        System.out.println("Result from private method in A: " + resultA);

        myClass.defaultMethod(10);

        int resultC = myClass.methodWithReturnAndNoArgument();
        System.out.println("Result from method C: " + resultC);

        myClass.methodWithNoReturnAndNoArgument();

        myClass.nestedMethod();
    }
}