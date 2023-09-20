package Lec_9;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={3,1,2,5,4,9,8};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("========>");
        selection(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection(int arr[]){
        for(int i=0;i< arr.length;i++){
            int min_idx=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int c=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=c;
        }
    }
}
