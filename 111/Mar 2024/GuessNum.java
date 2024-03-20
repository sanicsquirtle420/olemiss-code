/*
03/20/24
Makes you guess a number from 1 - 100 until
you get it correct. With it giving you hints
*/
import java.util.Scanner ; 
import java.util.Random ; 

public class GuessNum {
	public static void main(String [] args) {
		int num , guessNum; 
		
		Random rand = new Random() ;
		num = 1 + rand.nextInt(100) ;  // a + rand.nextInt(b - a + 1) 
		
		Scanner input = new Scanner(System.in) ; 
		System.out.println("Guess a number between 1 and 100: ") ;
		guessNum = input.nextInt() ; 
		
		while(guessNum != num) {
			if (guessNum < num) 
				System.out.println("Guess is too low guess again!") ; 
			
			else
				System.out.println("Guess is too high guess again!") ; 
			
			System.out.println("Guess a number between 1 and 100: ") ;
			guessNum = input.nextInt() ;
		
		System.out.println("Congrats you guessed correctly!") ;
		}
	}
}
