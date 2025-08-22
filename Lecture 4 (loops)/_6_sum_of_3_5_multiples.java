//method to sum all the muultiples of 3 and 5 upto n


public class _6_sum_of_3_5_multiples {

    public static int sum_three_five(int n){
        int sum =0;
        for (int i=1; i<=n; i++){
            if (i%3 ==0 || i%5==0){
                sum += i;
                System.out.println(i+" ");
            }
        }
        System.out.println("The sum is: ");
        return sum;
    }
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sum_three_five(n));
    }
}

//if it is dividing by 3 and 5 then 15 too will be divisible by i
