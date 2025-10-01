public class NestedTryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started.");

            try {
                System.out.println("Inner try block started.");
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println("Caught in inner catch block: " + e);
            } finally {
                System.out.println("Inner finally block executed.");
            }

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught in outer catch block: " + e);
        } finally {
            System.out.println("Outer finally block executed.");
        }
    }
}
