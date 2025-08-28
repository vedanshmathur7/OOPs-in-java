public class _4_rightside_half_triangle {
    public static void main(String[] args) {
        // int n =5;
        // for (int i = 1; i<=n; i++){
        //     for (int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
            
        //     for (int k=1; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();



// ----------------------------------------sir method----------------------
        int n=5;
        int nsp = n-1;
        int nst = 1;
        int row = 1;

        while (row <= n){

            int csp = 1;

            while (csp <= nsp){
                System.out.print(" ");
                csp ++;
            }

            int cst = 1;

            while (cst <= nst){
                System.out.print("*");
                cst ++;
            }

            nsp -= 1;
            nst += 1;
            row += 1;

            System.out.println();
        }


    }
}
