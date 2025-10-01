public class OneDMultiple {
    public static void printn(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static int[] show(int a[]){
        //int[] :array stored
        return a;
    }
    public static int add(int a){
        //single value return onyl
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=a;
        printn(b);
    }
}