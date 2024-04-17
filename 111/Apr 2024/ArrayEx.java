import java.util.Random ; // 04/17/24

public class ArrayEx {
	public static void main(String [] args) {
		int[] intArray = new int[5] ;
		
		Random rand = new Random() ;
		
		for (int i = 0 ; i < intArray.length ; i++) { // giving random values to array
			intArray[i] = rand.nextInt(21) ; // 0 - 20
		}
		
		System.out.print("The array contains: ") ; // printing the array
		for (int value : intArray) {
			System.out.print(value + " ") ;
		}
		
		int sum = sumUp(intArray) ; // calling sumUp method
		System.out.printf("\nThe sum is %d." , sum) ;
		
		int max = intArray[0] , min = intArray[0] ;
		int maxIndex = 0 , minIndex = 0 ;
		
		for (int i = 0 ; i < intArray.length ; i++) {
			if (intArray[i] > max) { // getting the max and maxIndex of array
				max = intArray[i] ;
				maxIndex = i ;
			}
			
			if (intArray[i] < min) { // getting the min and minIndex of array
				min = intArray[i] ;
				minIndex = i ;
			}
		}
		
		System.out.printf("\nThe max is %d and the index is %d" , max , maxIndex) ;
		System.out.printf("\nThe minimum is %d and the index is %d" , min, minIndex) ;
	}
	
	public static int sumUp(int[] myArray) {
		int s = 0 ; // sumUp method that calculates the sum of the array
		for (int i = 0 ; i < myArray.length ; i++) 
			s += myArray[i] ;
			
		return s ;
	}
}
