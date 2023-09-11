package Lec_6;

import java.util.Scanner;

public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int sum=0;
        while (n!=0){
            int ldigit=n%10;
            sum+=ldigit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
