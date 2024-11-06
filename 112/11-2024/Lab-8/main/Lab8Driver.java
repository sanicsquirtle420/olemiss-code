public class Lab8Driver {
    public static void main(String[] args) {
        System.out.println("--- Part 1a ---") ;
        printNum(1, 5) ;

        System.out.println("--- Part 1b---") ;
        numBlock(5 , 0) ;

        System.out.println("--- Part 2 ---") ;
        Group test = new Group() ;

        test.addMember("Bob Jones" , 29) ;
        test.addMember("Susan Little" , 23) ;
        test.addMember("Kathy White" , 21) ;
        test.addMember("John Smith" , 27) ;
        test.addMember("Mike Ross" , 48) ;
        test.addMember("Jennifer Hunt" , 32) ;
        test.addMember("Walter Brown" , 55) ;
        test.addMember("Samantha Goings" , 47) ;
        test.addMember("Steve Barber" , 86) ;
        test.addMember("Terry Manson" , 37) ;

        System.out.println("The sum of everyone's age is " + test.sum(0 , test.logicalLength() - 1)) ;
        System.out.println("The average age is " + test.averageAge()) ;

        test.sort() ;
        System.out.println("--- Sorted! ---") ;
        test.print() ;
    }

    static void printNum(int n , int o) {
        if(n <= o) {
            System.out.println(n) ;
            printNum(n + 1 , o) ;
            System.out.println(n) ;
        }
    }

    static void numBlock(int n , int o) {
        if(n > o) {
            for(int i = 0 ; i < n ; i++) {
                System.out.print(n + " ") ;
            }
            System.out.println() ;
            numBlock(n - 1 , o) ;
            for(int i = 0 ; i < n ; i++) {
                System.out.print(n + " ") ;
            }
            System.out.println() ;
        }
    }
}
