import java.util.Scanner;

public class UnitTwoDM {

	public static void main(String[] args) {
		
/* 
Use if/else statements to take different actions depending on user input.  
Given an integer entered by a user, perform the following conditional actions:
If the integer entered is odd, print the number entered and “Odd.”
If the integer entered is even and in the inclusive range of 2 to 25, print “Even and less than 25.”
If the integer entered is even and in the inclusive range of 26 to 60, print “Even.”
If the integer entered is even and greater than 60, print the number entered and “Even.”
If the integer entered is odd and greater than 60, print the number entered and “Odd and over 60.”
*/
		
		
		
		String yesNo = "";
		String name = "";
		
		Scanner decision = new Scanner(System.in);	
		
		System.out.println("What is you name? ");
		name = decision.next();
		
		
		do {			

			  System.out.println("Hello " + name + " enter a number between 1 and 100");
			  	int num = decision.nextInt();
			  	
			  if(num <= 0) {
				  System.out.println("Please pick a number between 1 - 100 ");
				  
			  }	else if(num % 2 == 0 && num < 25) {
				  System.out.println(name + " " + num + " even and less than 25");
				  
			  }else	if(num % 2 != 0 && num < 60) {
				  System.out.println(name +" " +   num + " is odd");
				  
			    }else if(num % 2 == 0 && num >25 || num < 60) {
				  System.out.println(name + " " + num + " is even");
				  
			    }else if(num % 2 == 0 && num > 60) {
				  System.out.println(name + " "+ num + " is even");
				  
			    }else if(num % 2 != 0 && num > 60) {
				  System.out.println( name + " " + num + " is odd and over 60.");
			  }
			  
			  System.out.println("Continue? (Y/N)");
		      yesNo = decision.next();
		         
		      if(yesNo.equals("N") || yesNo.equals("n")) {
		    	   System.out.println("Good Bye " + name + "!");
		       } 
		         
		}while(yesNo.equals("Y") || yesNo.equals("y"));
		
			  
	}

}
