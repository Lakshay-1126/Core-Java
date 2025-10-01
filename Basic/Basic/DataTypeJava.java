// All primitive datatypes of java:

public class DataTypeJava {
    public static void main(String[] args) {
        // + :string operator (string +value add )
        // data typee :
        // boolean :true ya false
        boolean a = true;
        System.out.println("boolean :" + a);

        // char :alphabets
        char b = 'o';
        System.out.println("character : " + b);

        // byte :stored 127 to -128(numbers)
        byte c = 127;
        System.out.println("byte " + c);

        // short :32 thousand
        short d = 896;
        System.out.println("short " + d);

        // int : number
        int e = 75;
        System.out.println("the value of e " + e);

        float f=675.3f; //float f :in java decimal value by default stored in double 
        System.out.println("float :" + f);


        //long --->self 
        long g = 123456789012345L;  // 'L' is used to specify long literal
        System.out.println("Value of long: " + g);

        //double 
        double h = 3.14159;  // No suffix needed for double literals
        System.out.println("Value of double: " + h);

    }

}