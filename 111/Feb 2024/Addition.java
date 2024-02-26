/*
02/26/2024
This program creates addition problems and tells you if your answer is correct. 
*/
import java.util.Scanner ; 
import java.util.Random ; 

public class Addition {
	public static void main(String [] args) {
		int num1 , num2 , answer ; 
	
		Random rand = new Random() ; 
		num1 = rand.nextInt(10) ; 
		num2 = rand.nextInt(10) ; 
	
		Scanner input = new Scanner(System.in) ; 
		System.out.printf("What is %d + %d = " , num1 , num2) ;
		answer = input.nextInt() ; 
	
		if (answer == num1 + num2) {
			System.out.println("Correct!") ; 
		}
	
		else {
			System.out.println("Wrong!") ; 
		}
	}
}
