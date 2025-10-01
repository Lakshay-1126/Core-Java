public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); 

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 

            int result = 10 / 0; 
        } 
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } 
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
