class A{
    private A(){
        System.out.println("private costructor");
    }
    static void show(){
        new A();
        
    }
}



public class Costructoraccess1 {
    public static void main (String[] args) {
        A.show();   

    }
}
