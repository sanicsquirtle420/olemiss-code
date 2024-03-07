/*
03/06/2024
showing some examples of .equals and .compareTo (with IgnoreCase) as well
*/
import java.util.Scanner ;

public class CompareStr {
	public static void main(String [] args) {
		String s1 = "Hello" , s2 = "hello" ;
		
		System.out.println(s1.equals(s2)) ;
		System.out.println(s1.equalsToIgnoreCase(s2)) ;
		System.out.println(s1.compareTo(s2)) ;
		System.out.println(s1.compareToIgnoreCase(s2)) ; 
	}
}
