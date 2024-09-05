package Conditionalstatement;

public class Voter {
	public static void main(String[] args) {
		boolean Indian=true;
		int age=78;
		boolean voter=true;
		
		if(Indian==true) {
			
			if(age>=18) {
				
				if(voter==true) {
					System.out.println("You are able to vote");
				}else {
					System.out.println("You don't have voter card");
				}
				
			}else {
				System.out.println("You are under age");
			}
			
		}else {
			System.out.println("not eligible to vote beacue you are not indian");
		}
	}

}
