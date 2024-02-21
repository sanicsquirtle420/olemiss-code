// 02/14/2024

import java.util.Scanner ;

public class AreaCy {
	public static void main (String [] args) {
		double rad , len , area , vol ;
		Scanner input = new Scanner(System.in) ;
		System.out.print("What is the raidus? ") ;
		rad = input.nextDouble() ; 
		
		Scanner input2 = new Scanner(System.in) ;
		System.out.print("What is the length? ") ;
		len = input2.nextDouble() ;
		
		area = 3.14159 * Math.pow(rad , 2) ;
		System.out.println("The area is " + area) ;
		
		vol = area * len ;
		System.out.println("The volume is " + vol) ; 
		
	}
}
