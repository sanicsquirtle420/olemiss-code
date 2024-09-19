// 09/18/24
public class Driver {
    public static void main(String[] args) {
        Practice test = new Practice() ;

        test.addIntToArray(15);
        test.standardFor();
        test.changeInt() ;
        test.enhancedFor() ;

        test.addStrToArray("The") ;
        test.addStrToArray("Time") ;
        test.addStrToArray("and") ;
        test.addStrToArray("Tide") ;
        test.addStrToArray("waits") ;
        test.addStrToArray("for") ;
        test.addStrToArray("no") ;
        test.addStrToArray("one") ;

        test.normalStr();
        System.out.println() ;
        test.reverseStr();
        System.out.println() ;
        test.FirstLength() ;
        test.EvenNum();

        test.addInt2DArray() ;
        test.printRowCol() ;
        System.out.println() ;
        test.printColRow() ;

        System.out.println() ;
        test.DecForPrintF(76530420.638092);

        System.out.println() ;
        test.PrintFvsStrFor("First" , "Second" , "Third");
    }
}
