import java.util.*;
public class lec3 {
    public static void main(String[] args) {

        // ------------------------checking if the no. is even or not----------------------
        // int num = 11;
        // System.out.println("hi");

        // if (num%2==0){
        //     System.out.println("num is even");
        // }
        // else {
        //     System.out.println("no it is not!");
        // }

        // System.out.println("bye");


        // ------------------checking if the char is vowel or not-------------------------
        // char vedansh  = 'l' ;

        // if (vedansh == 'a' ||vedansh == 'e' || vedansh == 'i'||vedansh == 'o'||vedansh == 'i'){
        //     System.out.println("yes it is vowel !");
        // }
        // else{
        //     System.out.println("no it's not!");


        // -----------------------largest of three-----------------

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter no. 1: ");
        // int a = sc.nextInt();
        // System.out.println("Enter no. 2: ");
        // int b = sc.nextInt();
        // System.out.println("Enter no. 3: ");
        // int c = sc.nextInt();

        // if (a >= b && a >=c){
        //     System.out.println("a is the largest no.");
        // }
        // else if (c >= b && c >=a) {
        //     System.out.println("c is the largest no.");
        // }
        // else if (b >= a && b >=c) {
        //     System.out.println("b is the largest no.");
        // }

        // -------------------adult/child------------------- 

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your age homie: ");
        // int age = sc.nextInt();

        // if (age>= 18 && age <= 60){
        //     System.out.println("bro you're adult!");
        // }
        // else if (age> 60) {
        //     System.out.println("senior");
        // }
        // else{
        //     System.out.println("child");
        // }


        // ---------------largest and second largest of 4 no.--------------------

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. 1: ");
        int a = sc.nextInt();
        System.out.println("Enter no. 2: ");
        int b = sc.nextInt();
        System.out.println("Enter no. 3: ");
        int c = sc.nextInt();
        System.out.println("Enter no. 4: ");
        int d = sc.nextInt();


        int largest , second_largest;

        if (a >= b && a >=c  && a >=d){
            largest = a;
            System.out.println("a is the largest no.");
        }
        else if (c >= b && c >=a && c >=d) {
            largest = c;
            System.out.println("c is the largest no.");
        }
        else if (b >= a && b >=c && b >=d) {
            largest = b;
            System.out.println("b is the largest no.");

        }
        else if (d >= a && d >=c && d >=d) {
            largest = d;
            System.out.println("d is the largest no.");
        }





    }
}
