/* Check whether the trainge , square , reactanlge (area & volume)
->input area /volume 
area 
traingle square rectangle 
square  */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Area or Volume:");
        String choice = sc.next();
        if(choice.equals("Area")){
            System.out.println("Enter the choice Triangle,Square,Rectangle: " +choice );
            String shape=sc.next();
            if(shape.equals("Triangle")){
                System.out.println("Enter the value of b and h:");
                float b=sc.nextFloat();
                float h=sc.nextFloat();
                float area=1/2*b*h;
               System.out.print("Triangle area is: " +area);
            }
            else if(shape.equals("Square")){
                System.out.print("Enter the side:");
                float side=sc.nextFloat();
                float area=side*side;
                System.out.print("Square area is: "+area);
            }
            else if(shape.equals("Rectangle")){
                System.out.print("Enter the value of l and w:");
                float l=sc.nextFloat();
                float w=sc.nextFloat();
                float area=l*w;
                System.out.println("Rectangle area is: "+area);
            }
        }
        else if(choice.equals("Volume")){
           System.out.println("Enter the choice Triangle,Square,Rectangle:" +choice );
           String shape=sc.next();
           if(shape.equals("Triangle")){
            System.out.print("Enter the value of b and h:");
            float b=sc.nextFloat();
            float h=sc.nextFloat();
            float area=b*h;
           System.out.print("Triangle volume is:" +area);
        }
        else if(shape.equals("Square")){
            System.out.print("Enter the side:");
            float side=sc.nextFloat();
            float area=side*side*side;
            System.out.print("Square volume :"+area);
        }
        else if(shape.equals("Rectangle")){
            System.out.print("Enter the value of l and w and h:");
            float l=sc.nextFloat();
            float w=sc.nextFloat();
            float h=sc.nextFloat();
            float area=l*w*h;
            System.out.println("Rectangle volume :" +area);
        }
        }
        
    }
    
}