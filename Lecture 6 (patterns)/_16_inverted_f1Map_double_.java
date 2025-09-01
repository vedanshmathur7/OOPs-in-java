
public class _16_inverted_f1Map_double_ {

    public static void main(String[] args) {
        int n = 5;
        int rows = 2*n-1;
        int nsp = n-1;
        int nst = n;

        int row = 1;
        while (row<= rows){

            int csp =1;
            while (csp<=nsp){
                System.out.print("   ");
                csp ++;
            }

            int cst = 1;
            while (cst <= nst){
                System.out.print("*  ");
                cst++;
            }

            if (row <n){
                nsp-=1;
                nst -=1;
            }
            else{
                nsp += 1;
                nst+=1;
            }
            row+=1;
            System.out.println();

        }


    }
}
