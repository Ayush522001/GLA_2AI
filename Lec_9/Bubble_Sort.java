package Lec_9;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[]={3,1,2,5,4,9,8};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("========>");
        bubble(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubble(int arr[]){
        for(int turn=1;turn< arr.length;turn++) {
            for (int i = 0; i < arr.length - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    int c = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = c;
                }
            }
        }
    }
}
