// array create : taget value :3 check value present : 

public class ArrayBasic11 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int target = 3;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("present");
            }
        }
    }
}