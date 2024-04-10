// 04/08/24
import java.util.Scanner ; 

public class PrintMsgLoop {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter a message: ") ;
		String m = input.nextLine() ;
		System.out.print("How many times do you want to print? ") ;
		int n = input.nextInt() ; 
		
		printMsg(m , n) ;
	}
	
	public static void printMsg(String message , int num) {
		for (int i = 0 ; i < num ; i++) {
			System.out.println(message) ;
		}
	}
}
