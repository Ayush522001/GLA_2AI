package Lec_1;

public class Pattern_4 {
    public static void main(String[] args) {
        int n=5;

        int cstar=1;
        int cspace=n-1;
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
            cspace=cspace-1;
            cstar=cstar+1;
            System.out.println();
        }
    }
}
