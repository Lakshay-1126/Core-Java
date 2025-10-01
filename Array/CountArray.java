public class CountArray {
    public static void sortZeroAndOne(int a[]) {
        int ans[] = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;// 4
            }
        }
        for (int i = 0; i < ans.length; i++) {
            if (i < count) {
                ans[i] = 0;
            } else {
                ans[i] = 1;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 0, 1, 0, 1, 1, 0, 0, 1, 1 };
        sortZeroAndOne(a);

    }
}