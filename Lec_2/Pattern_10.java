package Lec_2;

public class Pattern_10 {
    public static void main(String[] args) {
        int n=5;

        int cstar=2*n-1;
        int cspace=0;
        int row_no=1;
        while (row_no<=n){
            int space=1;
            while (space<=cspace){
                System.out.print("  ");
                space=space+1;
            }
            int star=1;
            while (star<=cstar){
                System.out.print("* ");
                star=star+1;
            }
            row_no=row_no+1;
            cspace=cspace+1;
            cstar=cstar-2;
            System.out.println();
        }
    }
}

