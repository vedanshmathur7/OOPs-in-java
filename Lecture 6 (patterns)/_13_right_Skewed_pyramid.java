public class _13_right_Skewed_pyramid {
    public static void main(String[] args) {
        
        int n = 5;
        int total_rows = (2*n-1);
        int str = 1;
        

        int curr_row = 1;
        while (curr_row<=total_rows){
            

            int cst = 1;
            while(cst<=str){
                System.out.print("*  ");
                cst+=1;
            }

            if (curr_row<n){
                str++;
            }
            else{
                str--;
            }

            curr_row +=1;
            System.out.println();
        }




    }
}
