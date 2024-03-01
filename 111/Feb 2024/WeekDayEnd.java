// Using 'switch' statements with multiple cases - 02/28/2024
import java.util.Scanner ; 

public class WeekDayEnd {
	public static void main(String [] args) {
		int day ;
	
		Scanner input = new Scanner(System.in) ;
		System.out.println("Sun = 0, Mon = 1, Tue = 2, Wed = 3, Thu = 4, Fri = 5, Sat = 6");
		System.out.print("Enter a day: ") ;
		day = input.nextInt() ; 
		
		switch(day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Weekday.") ;
				break ;

			case 0:
			case 6:
				System.out.println("Weekend.") ;
				break ;
			
			default:
				System.out.println("Invalid Day.") ;
				break ;
		}
	}
}
