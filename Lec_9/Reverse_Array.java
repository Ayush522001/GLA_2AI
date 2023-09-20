package Lec_9;

public class Reverse_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("==========>");
//        reverse(arr);
        reverse3(arr);
    }
    public static void reverse(int arr[]){
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse3(int arr[]){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int c=arr[start];
            arr[start]=arr[end];
            arr[end]=c;
            start++;
            end--;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
