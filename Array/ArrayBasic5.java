public class ArrayBasic5 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        //even number 
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}