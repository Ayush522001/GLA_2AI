package Lec_6;

import java.util.Scanner;

public class Bin_to_Dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int result=0;
        int multiplier=1;
        while (n!=0){
            int rem=n%10;
            result=result+(rem*multiplier);
            multiplier=multiplier*2;
            n=n/10;
        }
        System.out.println(result);
    }
}

