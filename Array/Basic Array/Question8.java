/* 12,67,46,435,607,385,33,335,34,23

output:
607,435,46,67,12,385,33,335,34,23 */

public class Question8 {
    public static void main(String[] args) {
        int a[]={12,67,46,435,607,385,33,335,34,23};
        for(int i=a.length-6;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        for(int i=5;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
