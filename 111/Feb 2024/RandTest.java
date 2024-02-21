/*
02/21/2024
Introduced the "Random" class and how to use
ex.) num = a + rand.nextInt(b - 1 + 1) ; 
'num' and 'rand' are variables
*/

import java.util.Random ;  // Import random class

public class RandTest {
	public static void main(String [] args) {
		int num ;
		
		Random rand = new Random() ; 
		num = 30 + rand.nextInt(41) ; // Random int from 30 - 70
		
		System.out.println(num) ; 
	}
}
