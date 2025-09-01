public class _14_left_skewed_pyramid {
    public static void main(String[] args) {
        
        int n = 5;
        int total_rows = (2*n-1);
        int str = 1;
        int spc = n-1;
        

        int curr_row = 1;
        while (curr_row<=total_rows){
            
            int csp =1;
            while(csp<=spc){
                System.out.print("   ");
                csp++;
            }


            int cst = 1;
            while(cst<=str){
                System.out.print("*  ");
                cst+=1;
            }

            if (curr_row<n){
                str++;
                spc--;
            }
            else{
                str--;
                spc++;
            }

            curr_row +=1;
            System.out.println();
        }
    }
}
