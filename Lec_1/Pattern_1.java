package Lec_1;

public class Pattern_1 {
    public static void main(String[] args) {
        int n=5;

        int row_no=1;
        while (row_no<=n){
            int star=1;
            while (star<=n){
                System.out.print("* ");
                star=star+1;
            }
            row_no=row_no+1;
            System.out.println();
        }
    }
}
