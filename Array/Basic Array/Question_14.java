/* 1,2,3,4,5,6,7,8,9,10 :

output :
9,7,4,2 */

public class Question_14 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=a.length-1;i>5;i--){
            if(a[i]%2!=0){
                System.out.print(a[i]+" ");
            }
        }
        for(int i=a.length-6;i>=0;i--){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
        
    }
}
