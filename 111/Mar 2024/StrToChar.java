// 03/06/2024
import java.util.Scanner ;

public class StrToChar {
	public static void main(String [] args) {
		String charString ;
		char ch ;
		
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter a character: ") ;
		charString = input.next() ; 
		ch = charString.charAt(0) ;
		
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " is an uppercase letter") ;
		
		else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is a lowercase letter") ;
		
		else if (ch >= '0' && ch <= '9')
			System.out.println(ch + " is a numerical value") ;
		
		else
			System.out.println(ch + " is not a letter or numeric value") ;
	}
}
