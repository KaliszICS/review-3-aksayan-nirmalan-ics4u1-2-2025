import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner scan=new Scanner(System.in);
		String h;
		h=" H";
		System.out.println("In:" +h);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner scan= new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(5 > 6);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner scan=new Scanner(System.in);
		int n= 9;
		System.out.print("In: ");
		System.out.println(n>5);
	}

	public static void q4() {
		//Write question 4 code here
		System.out.println("In: "+(-2<=2));
	}

	public static void q5() {
		//Write question 5 code here
		String n="Hello World";
		System.out.println("In: "+ "Hello World".equals(n));
	}

	public static void q6() {
		//Write question 6 code here
		int o=7;
		int u=10;
		System.out.println("In: In: "+(o<u));
	}

	public static void q7() {
		//Write question 7 code here
		System.out.println("In: In: "+(1>3));
	}

}
