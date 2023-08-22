package Lec_3;

public class Pattern_18 {
    public static void main(String[] args) {
        int n=7;

        int row_no=1;
        int cstar=1;
        int cspace=n/2;
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
            if(row_no<(n/2+1)) {
                cstar = cstar + 2;
                cspace = cspace - 1;
            }
            else{
                cstar = cstar - 2;
                cspace = cspace + 1;
            }
            row_no=row_no+1;
            System.out.println();
        }
    }
}
