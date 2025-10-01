class A{
    int a = 10;
    int b = 20;
    void hey(){
        System.out.println("class A");
    }
}

class B{
    int c = 30;
    int d = 40;
    void hello() {
        System.out.println("class B");
    }
}

public class Test {
     
    public static void main(String[] args) {
        A a1 = new A();
        a1.hey();
        B a2 = new B();
        a2.hello();
    }

}
