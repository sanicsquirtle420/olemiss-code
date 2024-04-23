/*
04/22/24
Rectangle.java is needed for this program to work because
that file contains the Rectangle class.
*/
import java.util.Scanner ;

public class RectangleTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("Enter the length of the rectangle: ") ;
		double l = input.nextDouble() ;
		System.out.print("Enter the width of the rectangle: ") ;
		double w = input.nextDouble() ;
		
		Rectangle rec = new Rectangle(l , w) ; // create a rectangle object
		
		double a = rec.getArea() ; // get area
		
		System.out.printf("The area is %.3f" , a) ;
	}
}
