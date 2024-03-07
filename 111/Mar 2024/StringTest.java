/* 
03/06/2024
Learned some new commands for strings.
This one shows .length and .charAt
*/
import java.util.Scanner ;

public class StringTest {
	public static void main(String [] args) {
		String message ;
		
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter a message: ") ;
		message = input.nextLine() ;
		
		System.out.println("The length is " + message.length() + " characters") ;
		System.out.println("The first character is " + message.charAt(0)) ;
		System.out.println("The last character is " + message.charAt(message.length() - 1)) ;
	}
}
