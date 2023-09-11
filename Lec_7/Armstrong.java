package Lec_7;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int count=count(n);
        if(armstrong(n,count)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    public static int count(int n){
        int c=0;
        while (n!=0){
            c++;
            n=n/10;
        }
        return c;
    }
    public static boolean armstrong(int n,int count){
        int ans=0;
        int backup=n;
        while (n!=0){
            int digit=n%10;
            ans+=(int)Math.pow(digit,count);
            n=n/10;
        }
        return ans==backup;
    }
}
