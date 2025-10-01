class A{
    int show(){
        int a=432;
        return a;
    }
    float show1(){
        float a=1.23f;
        return a;
    }
    char show2(){
        char a='m';
        return a;
    }
    short show3(){
        short a=67;
        return a;
    }
    boolean show4(){
        boolean a=true;
        return a;
    }
    long show5(){
        long a=2589634;
        return a;
    }
    byte show6(){
        byte a=5;
        return a;
    }
    double show7(){
        double a=24.5;
        return a;
    }
}
public class MethodBasic7 {
    public static void main(String[] args) {
        A p=new A();
        System.out.println(p.show());
        System.out.println(p.show1());
        System.out.println(p.show2());
        System.out.println(p.show3());
        System.out.println(p.show4());
        System.out.println(p.show5());
        System.out.println(p.show6());
        System.out.println(p.show7());
    }
}