// 03/25/24
import java.util.Scanner ;

public class Palindrome {
	public static void main(String [] args) {
		String word1 , word2 = "" ;
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter a word: ") ;
		word1 = input.next() ; 
		
		for(int i = word1.length() - 1 ; i >= 0 ; i--) {
			word2+= word1.charAt(i) ; 
		}
		
		if (word1.equals(word2))
			System.out.printf("%s is a palindrome." , word2) ;
			
		else
			System.out.printf("%s is not a plaindrome." , word1) ;
	}
}
