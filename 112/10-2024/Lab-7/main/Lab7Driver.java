import java.io.IOException;

public class Lab7Driver {
    public static void main(String[] args) throws IOException {
        ReadAndCalc calc = new ReadAndCalc() ;
        int nums[] = calc.populateArray("Data.txt") ;

        System.out.println("Welcome to the number file reader!") ;
        System.out.println("You will be asked for a number of values to calculate.") ;

        calc.calcValues(nums) ;
    }
}
