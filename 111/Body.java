/*
Notes:
'\n' = new line
*/

import java.util.Scanner ;

public class Body {
	public static void main (String [] args) {
		double hei , wei , bmi ;
		
		System.out.print("Enter your weight in pounds (lbs.)") ;
		Scanner input = new Scanner(System.in)  ;
		wei = input.nextDouble() ; 
		wei = wei * 0.454 ;
		
		System.out.print("Enter your height in inches (in.)") ;
		Scanner input2 = new Scanner(System.in)  ;
		hei = input2.nextDouble() ;
		hei = hei * 0.0254 ;
		
		bmi = wei / Math.pow(hei , 2) ;
		
		System.out.printf("\nYour BMI is %.1f" , bmi) ;
	}
}
