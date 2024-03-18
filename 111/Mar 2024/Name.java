// 03/18/2024
import java.util.Scanner ;

public class Name {
	public static void main(String [] args) {
		String name , first , last ;
		int commaIndex ;
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter your name [Format: Last, First]: ") ;
		
		name = input.nextLine() ; // to get the output as a string
		
		commaIndex = name.indexOf(",") ;
		
		last = name.substring(0 , commaIndex) ;
		first = name.substring(commaIndex + 2) ;
		
		System.out.printf("Your first name is %s and your last name is %s." , first , last) ;
	}
}
