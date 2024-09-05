package Conditionalstatement;

import java.util.Scanner;

public class Numberofdays {
 
	
		    public static void main(String[] args) 
		    {
		        Scanner sc = new Scanner(System.in);
		        

		        System.out.print("Enter month (1-12): ");
		        
		        int month = sc.nextInt();

		        
		        if (month == 1|| month == 3 || month == 5 || month == 7 || month == 9 || month == 11 )
		        {
		           System.out.println(31);
		        	
		        } else if (month == 4 || month == 6 || month == 8 || month == 10 || month==12) {

			           System.out.println(30);
			        	
			        		        }
		        
		        else if (month == 2) 
		        { 

			           System.out.println(28);
			        	
			        
		           
		        }
		        else {

			           System.out.println("Wrong Input");
			        	
			        
		        }
		        }
}



		    
	

