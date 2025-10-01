public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; 
            System.out.println("This will not be executed because of the exception");
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } 
        finally {
            System.out.println("This block will always execute, whether an exception is thrown or not.");
        }
    }
}
