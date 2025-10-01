public class MultipleTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("First try block:");
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }

        try {
            System.out.println("\nSecond try block:");
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }

        try {
            System.out.println("\nThird try block:");
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        }

        try {
            System.out.println("\nGeneral try block:");
            String text = "123";
            int number = Integer.parseInt(text);  
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }
}
