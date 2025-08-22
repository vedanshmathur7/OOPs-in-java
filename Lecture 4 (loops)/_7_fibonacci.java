public class _7_fibonacci {
    public static void main(String[] args) {
        long a=0;
        long b=1;
        int range = 50;
        for (int i=1; i<=range ; i++ ){
            System.out.println(a);
            long c=a+b;
            a=b;
            b=c;            
        }        
    }
}
