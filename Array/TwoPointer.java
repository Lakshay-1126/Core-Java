public class TwoPointer {
    // print array
    public static void printn(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int a[], int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    public static void sortZeroAndOne(int a[]) {
        int left = 0;// 0
        int right = a.length - 1;// right=7
        while (left < right) {
            // first work :a[left]==0 -->no work (only one step aagey jaega )
            if (a[left] == 0) {
                // no work
                left++;
            }
            if (a[right] == 1) {
                // no work
                right--;
            }
            if (a[left] == 1 && a[right] == 0) {
                // swap
                swap(a, left, right);
                left++;
                right--;
            }
        }
        printn(a);
    }

    public static void main(String[] args) {
        int a[] = { 0, 1, 1, 0, 0, 1, 1, 0 };
        sortZeroAndOne(a);
    }
}