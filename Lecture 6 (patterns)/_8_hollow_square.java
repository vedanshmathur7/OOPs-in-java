public class _8_hollow_square {
    public static void main(String[] args) {
        int n = 5;
        int nsp = 0;
        int nst = n;
        int row = 1;

        while (row <= n) {

            int csp = 1;

            while (csp <= nsp) {
                System.out.print("   ");
                csp++;
            }

            int cst = 1;

            while (cst <= nst) {
                System.out.print("*  ");
                cst++;
            }

            nsp += 2;
            nst -= 1;
            row += 1;

            System.out.println();
        }
    }
}
