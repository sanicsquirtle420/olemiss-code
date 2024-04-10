/* 
04/10/24 
Similar to ~/111/Mar 2024/Palindrome.java except
this is only spelling a word backwards and it is
in a method. 
*/
import java.util.Scanner ; 

public class ReverseStr {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter a word: ") ;
		String w = input.nextLine() ;
		
		String w2 = reverse(w) ;
		
		System.out.printf("The reverse of %s is %s." , w , w2) ;
	}
	
	public static String reverse(String word) {
		String backward = "" ;
		
		for(int i = word.length()-1 ; i >= 0 ; i--) {
			backward += word.charAt(i) ;
		}
		
		return backward ; 
	}
}
