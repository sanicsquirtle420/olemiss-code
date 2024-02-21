/*
02/21/2024
Introduction of if / else / if else statements
*/
import java.util.Scanner ;

public class Numbers {
	public static void main(String [] args) {
		int num ;
		
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter an integer: ") ;
		num = input.nextInt() ; 
		
		if (num % 5 == 0) {                   //if statement
			System.out.println("Hi Five!") ;
		}
		
		if (num % 2 == 0) {
			System.out.println("Hi Even!") ;
		}
		
	}
}
