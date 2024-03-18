/*
03/18/2024
Note: count+= 2 ; // goes by 2's so it would only print 5 times (in this case)
*/
public class WhileTest {
	public static void main(String [] args) {
		int count = 0 ;
		
		while(count < 10) {
			System.out.printf("%d.) Life protects life.\n" , count) ; // displays the count and text
			count++ ; // adds 1 after each "count"
		}
	}
}
