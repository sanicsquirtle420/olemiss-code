// 03/27/24
import java.util.Scanner ;

public class CountVowel {
	public static void main(String [] args) {
		String sentence , vowels = "aeiouAEIOU" ;
		int countV = 0 ;
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter a sentence: ") ;
		sentence = input.nextLine() ; 
		
		for (int i = 0 ; i < sentence.length() ; i++) {
			for (int j = 0 ; j < vowels.length() ; j++) {
				if (sentence.charAt(i) == vowels.charAt(j))
					countV++ ;
			}
		}
		
		System.out.printf("\nThere are %d vowels in the sentence." , countV) ;
	}
}
