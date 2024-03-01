/*
Using the 'switch' statements instead of 'if / else if / else' statements
02/28/24
*/
import java.util.Scanner ; 

public class TotalCost {
	public static void main(String [] args) {
		double weight , cost ;
		String fruit ;
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Type the name for the type of fruit: ") ;
		fruit = input.nextLine() ; 
		
		Scanner input2 = new Scanner(System.in) ; 
		System.out.print("Enter the weight for the fruit (lbs.): ") ;
		weight = input2.nextDouble() ;
		
		switch(fruit) {
			case "Orange" :
				cost = 0.59 * weight ;
				System.out.printf("\nYour cost is $%.2f" , cost) ; 
				break ;
				
			case "Apple" :
				cost = 0.48 * weight ;
				System.out.printf("\nYour cost is $%.2f" , cost) ; 
				break ;
				
			case "Cherry" :
				cost = 4.19 * weight ;
				System.out.printf("\nYour cost is $%.2f" , cost) ; 
				break ;
				
			case "Papaya" :
			case "Mango" :
				cost = 3.79 * weight ;
				System.out.printf("\nYour cost is $%.2f" , cost) ; 
				break ;
				
			default: 
				System.out.println("\nFruit isn't real.") ;
				break ;
		}
	}
}
