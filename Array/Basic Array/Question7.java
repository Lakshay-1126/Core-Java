/* 12,67,46,435,67,385,33,335,34,23

output:
12,67,46,435,67,23,34,335,33,385  */

public class Question7 {
    public static void main(String[] args) {
        int a[]={12,67,46,435,67,385,33,335,34,23};
        for(int i=0;i<a.length-5;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=a.length-1;i>=5;i--){
            System.out.print(a[i]+" ");
        }
    }
}
