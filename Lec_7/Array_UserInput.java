package Lec_7;

import java.util.Scanner;

public class Array_UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int[size];
        for(int index=0;index<size;index++){
            arr[index]= sc.nextInt();
        }
        System.out.println("===========>");
        for(int index=0;index<arr.length;index++) {
            System.out.println(arr[index]);
        }
        int arr2[]={1,21,33,20,77,83};
    }
}
