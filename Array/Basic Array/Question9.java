/* 12,67,46,435,607,385,33,335,34,23

output:
607,435,46,67,12,23,34,335,33,385  */

public class Question9 {
    public static void main(String[] args) {
        int a[]={12,67,46,435,607,385,33,335,34,23};
        for(int i=a.length-6;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        for(int i=a.length-1;i>=5;i--){
            System.out.print(a[i]+" ");
        }
    }
}
