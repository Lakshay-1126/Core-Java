//  print element greater than 23 :-

public class ArrayBasic14 {
    public static void main(String[] args) {
        int a[] = { 45, 23, 12, 98, 54 };
        int x = 23;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x) {
                System.out.print(a[i] + " ");
            }
        }
    }
}