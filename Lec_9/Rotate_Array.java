package Lec_9;

public class Rotate_Array {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int k=304;
    k=k% arr.length;
//    rotate(arr,k);
        rotate2(arr,k);
    }
    public static void rotate(int arr[],int k){
        for(int j=1;j<=k;j++){
            int c=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=c;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void rotate2(int arr[],int k){
        reverse3(arr,0, arr.length-k-1);
        reverse3(arr,arr.length -k, arr.length-1);
        reverse3(arr,0, arr.length-1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse3(int arr[],int i,int j){
        int start=i;
        int end= j;
        while (start<=end){
            int c=arr[start];
            arr[start]=arr[end];
            arr[end]=c;
            start++;
            end--;
        }
//        for(int k=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

    }
}
