package Lec_3;

public class Pattern_20 {
    public static void main(String[] args) {
        int n = 7;

        int row_no = 1;
        int lspace = n / 2;
        int mspace = -1;
        while (row_no <= n) {
            if (row_no == 1 || row_no == n) {
                int left = 1;
                while (left <= lspace) {
                    System.out.print("  ");
                    left = left + 1;
                }
                System.out.print("* ");
            } else {
                int left = 1;
                while (left <= lspace) {
                    System.out.print("  ");
                    left = left + 1;
                }
                System.out.print("* ");
                int middle = 1;
                while (middle <= mspace) {
                    System.out.print("  ");
                    middle = middle + 1;
                }
                System.out.print("* ");
            }
            if (row_no < (n / 2 + 1)) {
                lspace = lspace - 1;
                mspace = mspace + 2;
            } else {
                lspace = lspace + 1;
                mspace = mspace - 2;
            }
            row_no = row_no + 1;
            System.out.println();
        }
    }
}
