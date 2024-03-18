// 03/18/2024
import java.util.Scanner ; 

public class MajorStatus {
	public static void main(String [] args) {
		String majorStatus , major = "", status = "" ;
		char majorC , statusC ;
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("[Key] M = Mathematics, C = Computer Science, I = Information Technology") ;
		System.out.println("[Key] 1 = Freshman, 2 = Sophomore, 3 = Junior, 4 = Senior") ;
		System.out.print("Enter 2 Characters: ") ;
		majorStatus = input.next() ;
		
		majorC = majorStatus.charAt(0) ;
		statusC = majorStatus.charAt(1) ;
		
		if(majorC == 'M' || majorC == 'C' || majorC == 'I' && statusC >= '1' && statusC <= '4') {
			switch(majorC) {
				case 'M':
					major = "Mathematics" ;
					break ;
				case 'C':
					major = "Computer Science" ;
					break ;
				case 'I':
					major = "Information Technology" ;
					break ;
			}
			switch(statusC) {
				case '1':
					status = "Freshman" ;
					break ;
				case '2':
					status = "Sophomore" ;
					break ;
				case '3':
					status = "Junior" ;
					break ;
				case '4':
					status = "Senior" ;
					break ;
			}
			System.out.printf("\nYour major is %s and your status is %s." , major , status) ;
		}	

		else 
			System.out.println("Invalid input.") ;
	}
}
