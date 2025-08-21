import java.util.*;
public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("error aayega");
		
		float a = 89.3f;
		int c = 56;
		boolean d;
		
		System.out.println(a);
		System.out.println(c);
		d = true;
		
		System.out.println(d);
		
		d = c>a;
		System.out.println(d);

		System.out.println("hello world!");

		// comment

		/*
		 sdifjlksdjf 
		  s;kl;jflsdjflksf
		*/
		
		int age = 2 ;
		if (age <= 18) {
			System.out.println("op1");
		}
		else {
			System.out.println("op2");
		}
		
		Scanner sc = new Scanner(System.in); //sc can be anything
		// streams -> input/output
		//System.in & System.out

		System.out.println("Enter principle amt: ");
		int p = sc.nextInt();
		System.out.println("Enter rate: ");
		int r = sc.nextInt();
		System.out.println("Enter time period: ");
		int t = sc.nextInt();

		System.out.println("The amt is: ");
		int op = ((p*r*t)/100);

		System.out.println(op);





	}

}
