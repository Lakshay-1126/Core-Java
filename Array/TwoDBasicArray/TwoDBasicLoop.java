public class TwoDBasicLoop {
    public static void main(String[] args) {

        int a[][] = { { 1, 2 }, { 7, 8, 9, 9 }, { 9, 8, 6, 2 } };
        // first loop row
        for (int i = 0; i < a.length; i++) {
            // second loop column
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
