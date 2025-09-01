public class _9_spaced_pyramid {

    public static void main(String[] args) {
        int n = 5;
        int nsp = n-1;
        int nst = 1;
        int row = 1;

        while (row <= n) {

            int csp = 1;

            while (csp <= nsp) {
                System.out.print("   ");
                csp++;
            }

            int cst = 1;
            while (cst <= nst) {
                if(cst %2==0){
                    System.out.print("   ");
                }
                else {
                    System.out.print("*  ");
                }
                cst++;
            }

            nsp -= 1;
            nst += 2;
            row += 1;

            System.out.println();
        }
    }
}

