package Conditionalstatement;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		if (num>=0)
			System.out.println("Number is positve");
		else
			System.out.println("number is negative");
	}
	
}

