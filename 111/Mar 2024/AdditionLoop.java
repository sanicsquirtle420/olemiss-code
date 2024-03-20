/*
03/20/2024
Updated olemiss-code/111/Feb 2024/Addition.java to have 
a while loop that continues until the correct answer is 
given
*/
import java.util.Scanner ; 
import java.util.Random ; 

public class AdditionLoop {
	public static void main(String [] args) {
		int num1 , num2 , answer ; 
	
		Random rand = new Random() ; 
		num1 = rand.nextInt(10) ; 
		num2 = rand.nextInt(10) ; 
	
		Scanner input = new Scanner(System.in) ; 
		System.out.printf("What is %d + %d = " , num1 , num2) ;
		answer = input.nextInt() ; 
	
		while (answer != num1 + num2) {
			System.out.println("Incorrect answer!") ;
			System.out.printf("What is %d + %d = " , num1 , num2) ;
			answer = input.nextInt() ;
		}
		
		System.out.println("That is correct!") ; 
	}
}
