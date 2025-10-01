public class DeepCopy {
    // print array
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        // clone method type of object class
        int b[]=a.clone(); // deep copy (Object cloning)
        a[0]=0;
        a[1]=0;
        printArray(a);
        printArray(b);
    }

}
