package Lec_6;

import java.util.Scanner;

public class Dec_to_Bin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int result=0;
        int multiplier=1;
        while (n!=0){
            int rem=n%2;
            result=result+(rem*multiplier);
            multiplier=multiplier*10;
            n=n/2;
        }
        System.out.println(result);
    }
}
