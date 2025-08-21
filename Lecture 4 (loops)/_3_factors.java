//code that finds all the factors of the no.
// Scanner is a class , that is why 'S' is capital
import java.util.Scanner;

public class _3_factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. you wanna find the factors of: ");
        int num = sc.nextInt();

        int count =0;
        System.out.println("The factors are: ");
        for (int i=1; i<=num; i++){
            if (num % i==0){
                System.out.println(i+ " ");
                count ++;
            }
        }
        System.out.println("No. of factors = "+count);
    }
}
