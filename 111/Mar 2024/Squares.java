/* 
UPDATED: 03/27/24
Now the program gives the squares of numbers from the minInt to 
the maxInt. (I like this program more than the old one so it got
updated)
*/
import java.util.Scanner ;

public class Squares {
	public static void main(String [] args) {
		int minInt , maxInt; 
		
		Scanner input = new Scanner(System.in) ; 
		
		System.out.print("Enter the minimum integer: ") ;
		minInt = input.nextInt() ;
		System.out.print("Enter the maximum integer: ") ; 
		maxInt = input.nextInt() ;
		
		for (int i = minInt ; i <= maxInt ; i++) {
			System.out.printf("%d\t%d\n" , i , i*i) ;
		}
	}
}
