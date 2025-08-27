public class _2_decimal_to_binary {
    
    public static void main (String [] args){
        int num = 18;
        int final1 = 18;
        int multiplier = 0;
        int sum=0;

        while (num != 0){
            int first = num%2;
            first *= Math.pow(10, multiplier);
            num /= 2;
            multiplier++;
            sum += first;
        }
        System.out.println(sum);
        System.out.println(final1);
    }
}



// int n = 18;
// int sum = 0;
// int pow = 1;

// while (n!=0){
//     int rem = n%2;
//     sum += rem*pow;

//     pow *= 10;
//     n /= 2;
// }
// System.out.println(sum)