public class _17_diamond_spaced_square {
    public static void main(String[] args) {
        

        int n = 7;
        int nst = n/2;
        int nsp =  1;

        int row = 1;
        while (row<= n){

            int cst=1;
            while (cst<=nst){
                System.out.print("*  ");
                cst++;
            }

            int csp = 1;
            while (csp<=nsp){
                System.out.print("   ");
                csp++;
            }

            cst = 1;
            while (cst<=nst){
                System.out.print("*  ");
                cst++;
            }

            if (row < (n+1)/2){
                nst -=1;
                nsp +=2;
            }
            else {
                nst +=1;
                nsp -=2;
            }
            row ++;
            System.out.println();
        }
    }
}
