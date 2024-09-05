package Conditionalstatement;
import java.util.*;

public class positiveNeg {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float num1=sc.nextFloat();
		
		if(num1==0) {
			System.out.println("Zero");
		}else if(num1>0) {
			
			if(num1<1) {
				System.out.println("Small");
			}else if(num1>100000) {
				System.out.println("large");
			}else System.out.println("Positive");
			
		}else {
			System.out.println("Negative");
		}
		
		
			}

}
