// 03/25/24
public class Stars {
	public static void main(String [] args) {
		
		for(int i = 0 ; i <= 4 ; i++) { 	// outer loop prints 4 lines of 5 stars
			for (int j = 0 ; j <= 4 ; j++) { 	// inner loop prints 5 stars
				System.out.print("* ") ;			
			}
			System.out.println() ;
		}
		
		System.out.println() ;
		
		for(int i = 0 ; i <= 4 ; i++) { 	
			for (int j = 0 ; j < i ; j++) { 	// makes a triangle of stars
				System.out.print("* ") ;			
			}
			System.out.println() ;
		}
		
		System.out.println() ; 
		
		for(int i = 4 ; i > 0 ; i--) { 	
			for (int j = 0 ; j < i ; j++) { 	// makes an upside down triangle of stars
				System.out.print("* ") ;			
			}
			System.out.println() ;
		}
	}
}
