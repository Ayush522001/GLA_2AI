package Lec_3;

public class Pattern_17 {
    public static void main(String[] args) {
        int n=7;

        int row_no=1;
        int mspace=1;
        int cstar=n/2;
        while (row_no<=n){
            int left=1;
            while (left<=cstar){
                System.out.print("* ");
                left=left+1;
            }
            int space=1;
            while (space<=mspace){
                System.out.print("  ");
                space=space+1;
            }
            int right=1;
            while (right<=cstar){
                System.out.print("* ");
                right=right+1;
            }
            if(row_no<(n/2+1)){
                mspace=mspace+2;
                cstar=cstar-1;
            }
            else{
                mspace=mspace-2;
                cstar=cstar+1;
            }
            row_no=row_no+1;
            System.out.println();

        }
    }
}
