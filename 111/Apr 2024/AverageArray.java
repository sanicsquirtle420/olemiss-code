import java.util.Scanner ; // 04/15/24

public class AverageArray {
	public static void main(String [] args) {
		int sum = 0 , aboveAvg = 0 , belowAvg = 0;
		
		Scanner input = new Scanner (System.in) ;
		System.out.print("Enter the size of the array: ") ;
		int size = input.nextInt() ;
		
		int[] averageArray = new int[size] ;
		
		System.out.print("\nEnter " + size + " integers: ") ;
		for (int i = 0 ; i < size ; i++) {
			averageArray[i] = input.nextInt() ; 
		}
		
		for (int i = 0 ; i < size ; i++) {
			sum += averageArray[i] ; 
		}
		double average = sum / (double)size ;
		System.out.printf("The average is %.2f" , average) ;
		
		for (int i = 0 ; i < size ; i++) {
			if(averageArray[i] > average)
				aboveAvg++ ;
			
			if(averageArray[i] < average)
				belowAvg++ ;
		}
		
		System.out.printf("\nThere are %d above average and %d below average." , aboveAvg , belowAvg) ;
	}
}
