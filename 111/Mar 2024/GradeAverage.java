// 03/25/24
import java.util.Scanner ;

public class GradeAverage {
	public static void main(String [] args) {
		int grade , total = 0 , count = 0; 
		double average ; 
		
		Scanner input = new Scanner(System.in) ;
		while (count < 10) {
			System.out.print("Enter a grade: ") ;
			grade = input.nextInt() ; 
			total += grade ;
			count++ ;
		}
		average = total / 10.0 ;
		
		System.out.printf("The total is %d. The average is %.2f." , total , average) ;
	}
}
