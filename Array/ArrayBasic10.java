// print array through method : 

public class ArrayBasic10 {
    public static void printn(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={45,67,23,123};
        printn(a);
        int b[]={12,45,67,32,67,42};
        printn(b);
    }
}