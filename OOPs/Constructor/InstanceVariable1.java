/*Question:
 two number addition through instance variable way :constant 
 */

class A{
    int a=2;
    int b=3;
    void add(){
       int add = a+b;
       System.out.println(add); 
    }
}
public class InstanceVariable1 {
    public static void main(String[] args) {
        new A().add();
        
    }
}