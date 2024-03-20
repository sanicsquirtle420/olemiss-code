/*
03/20/2024
Asks 5 random subtractions questions then at the
end tells the user how many were answered correctly
*/
import java.util.Scanner ; 
import java.util.Random ; 

public class SubtractionLoop {
	public static void main(String [] args) {
		int num1 , num2 , answer ;
		int count = 0 , correctCount = 0 ;
		
		while(count < 5 ) {
			Random rand = new Random() ; 
			num1 = rand.nextInt(10) ; 
			num2 = rand.nextInt(10) ; 
			
			if (num1 < num2) {
				int temp = num1 ;
				num1 = num2 ;  // makes sure the bigger number is num1
				num2 = temp ;  // so that there is no negative answers
			}
		
			Scanner input = new Scanner(System.in) ; 
			System.out.printf("What is %d - %d = " , num1 , num2) ;
			answer = input.nextInt() ; 
		
			if (answer == num1 - num2) 
				correctCount++ ; // adds 1 to correctCount
			count++ ;  // adds 1 to count
		}
		
		System.out.printf("You answered %d questions correctly!" , correctCount) ; 
	}
}
