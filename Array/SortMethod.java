import java.util.Arrays;

public class SortMethod {
     // print array
    public static void printn(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []a = {2,4,3,2,1,4,5};
        Arrays.sort(a);
        printn(a);
    }
}
