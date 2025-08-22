import java.util.*;
public class _5_factorial {

public static int num_factorial(int num) {
    int fact = 1;
    for (int i=1; i<=num; i++){
        fact *= i;
    }
    return fact;
}
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the num you wanna find the factorial of: ");
        int num = sc.nextInt();
        System.out.println("The factorial of "+num+" is: ");
        System.out.println(num_factorial(num));


    }
}
