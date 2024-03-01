// 03/01/2024

import java.util.Scanner ; 
import java.util.Random ; // import statements

public class CoinGame { 	// class header
	public static void main(String [] args) {	// main method header
		int coin , choice; // declare variables for the inport and output
	
		Scanner input = new Scanner(System.in) ;
		System.out.print("Guess whether it's heads (0) or tails (1): ") ; // prompt for input
		choice = input.nextInt() ; 
		
		Random rand = new Random() ;
		coin = rand.nextInt(2) ; // Computer picks either 0 or 1
		
		if (choice < 0 || choice > 1) {
			System.out.println("Invalid guess. Your options are heads (0) or tails (1).") ; 
		}
	
		else if (choice == coin) {  // decide wheter the guess is correct or incorrect
			System.out.println("Your guess is correct!") ; // display the output
		} 
		
		else if (choice != coin) {
			System.out.println("Your guess was incorrect. The computer chose " + coin) ;
		}
	}
}
