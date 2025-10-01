import java.util.*;
public class ArrayBasic7 {
    public static void main(String[] args) {
        //user input 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size ");
        int size=sc.nextInt();
        //array :dynamic type 
        int a[]=new int[size];
        //input for loop 
        for(int i=0;i<size;i++){
            System.out.println("enter the value ");
            a[i]=sc.nextInt();
        }
        //for output :
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}