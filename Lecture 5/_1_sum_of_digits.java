public class _1_sum_of_digits{
    public static void main (String[] args){
        int num = 34125;
        int sum=0;
        while (num !=0){
            int first = num%10;
            sum += first;
            num /= 10;
        }
        System.out.println(sum);
    }
}