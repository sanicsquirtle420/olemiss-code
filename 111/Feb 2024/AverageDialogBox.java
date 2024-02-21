/*
02/12/2024
Notes:
This is the same program as olemiss-java/111/Average.java 
except it is using JOptionPane's dialog boxes. 
*/

import javax.swing.JOptionPane ;                                       // Import statement

public class AverageDialogBox {
	public static void main (String [] args) {
		String num1str , num2str ;
		int num1 , num2;
		double average ; 													                         // Declare variables
		
		num1str = JOptionPane.showInputDialog("Enter first integer. ") ;
		num1 = Integer.parseInt(num1str) ; 
		num2str = JOptionPane.showInputDialog("Enter second integer. ") ;   // Asking the user for integers
		num2 = Integer.parseInt(num2str) ; 									                // Converting string to integer
		
		average = ((num1 + num2) / 2.0);									                  // Calculate average
		
		JOptionPane.showMessageDialog(null, "The average is " + average); 	// Display
		System.exit(0) ;
	}
}
