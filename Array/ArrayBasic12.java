// array :1,2,3,5,4 :maximum element find :-
 
public class ArrayBasic12 {
 public static void main(String[] args) {
    int a[]={3,4,5,2,1};
    int max=a[0];
    for(int i=0;i<a.length;i++){
        if(a[i]>max){
            //value update :
            max=a[i];
        }
    }
    System.out.println(max);
 }   
}