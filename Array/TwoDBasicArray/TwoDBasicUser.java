import java.util.Scanner;

public class TwoDBasicUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter rows
        System.out.println("enter the rows ");
        int row = sc.nextInt();
        // enter cols
        System.out.println("enter the cols ");
        int cols = sc.nextInt();
        // array declare
        int a[][] = new int[row][cols];
        // first part :for input
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("enter value");
                a[i][j] = sc.nextInt();
            }
        }
        // second part :output
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}