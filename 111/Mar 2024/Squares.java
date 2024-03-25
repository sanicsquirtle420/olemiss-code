// 03/25/24
public class Squares {
	public static void main(String [] args) {
		int num = 1 , total = 0; 
		
		while(num <= 10) {
			System.out.printf("%d\t%d\n" , num , num*num) ; // \t is a tab
			total += num*num ; 
			num++ ;
		}
		System.out.printf("\nThe sum of all squares is %d" , total) ;
	}
}
