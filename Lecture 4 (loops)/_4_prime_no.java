import java.util.Scanner;

public class _4_prime_no {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. you wanna find the prime condition of: ");
        int num = sc.nextInt();

        int count =0;
        // System.out.println("The factors are: ");
        for (int i=2; i<num; i++){ //starting from 2 and ending till n-1 
            if (num % i==0){
                // System.out.println(i+ " ");
                count ++;
            }
        }

        if (count !=0){
            System.out.printf("No, %d is not the prime no. !", num);
        }
        else {
            System.out.printf("Yes %d is prime no.!", num);
        }
        // System.out.println("No. of factors = "+count);
    }
}
