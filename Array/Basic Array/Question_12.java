/* 1,2,3,4,5,6,7,8,9,10 :

output :
1,2,3,4,5,6,8,10  */

public class Question_12 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<a.length-5;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=5;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
