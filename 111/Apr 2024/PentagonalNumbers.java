/*
04/12/2024
Program Description: This program calculates the first 50 pentagonal numbers. 
*/
public class PentagonalNumbers {
	public static void main(String [] args) { // class header and main method header
		int pentNum = 1 ;
		System.out.println("The first 50 pentagonal numbers:") ;
	
		for(int count = 1 ; count <= 50 ; count++) { // use a loop to display the first 50 pentagonal numbers
			pentNum = getPentagonalNum(count) ; 
			
			if(count % 10 == 0) 	// 10 per line
				System.out.printf("%4d\t\n" , pentNum) ;
			
			else 
				System.out.printf("%4d\t" , pentNum) ; 
		}
	}
	
	public static int getPentagonalNum(int n) { // getPentagonalNum method definition
		n = n * (3 * n - 1) / 2 ;
		
		return n ;
	}
}
