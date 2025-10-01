// 3.4+1.2*(3.7-1.2)/2+6.8

public class ArithmeticUser6 {
    public static void main(String[] args) {
        float a = 3.4f, b = 1.2f, c = 3.7f, d = 1.2f, e = 2, f = 6.8f, g;
        g = a + b * ( c - d ) / e + f;
        System.out.println("the value of g is : " + g);
    }
}