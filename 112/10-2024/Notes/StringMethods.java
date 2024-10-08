import java.io.* ; // 10/07/24
import java.util.Scanner ;
public class StringMethods {
    public static void main(String[] args) throws FileNotFoundException {
        String words = "Let the kitsune guide you" ;

        /** replace method */
        String newWords = words.replace("k" , "b") ;
        System.out.println(words) ;
        System.out.println(newWords) ;
        System.out.println() ;

        /** trim method */
        String word1 = "     Welcome to" , word2 = " Orbit" ;
        System.out.println(word1 + word2) ;
        System.out.println(word1.trim() + word2) ; // only removes leading or trailing spaces

        String fruit = "strawberry grape apple banana" , fruitWord = "" ;
        String[] example = new String[5] ;
        int index = 0 ;

        /** Splitting strings into arrays */
        for(int i = 0 ; i < fruit.length() ; i++) {
            if(fruit.charAt(i) == ' ') {
                example[index] = fruitWord ;
                fruitWord = "" ;
                index++ ;
            }
            else {
                fruitWord += fruit.charAt(i) ;
            }
            if(i == fruit.length() - 1){
                example[index] = fruitWord ;
            }
        }
        for(int i = 0 ; i < example.length  ; i++){
            System.out.println(example[i]) ;
        }

        String[] fruits = fruit.split(" ") ; // easier
        System.out.println(fruits.length) ;

        for (String s : fruits) {
            System.out.println(s);
        }

        System.out.println() ;
        System.out.println("Type your email: ") ;
        Scanner input = new Scanner(System.in) ;
        String email = input.nextLine() ;
        String[] emailParts = email.split("[@.]") ;

        for(String s : emailParts) {
            System.out.println(s) ;
        }

        /** Reading from files */
        File file = new File("testfile.txt") ;
        Scanner scan = new Scanner(file) ;

        while(scan.hasNextLine()) {
            String line = scan.nextLine() ;
            String[] tokens = line.trim().split(" - ") ;

            System.out.print("1st Value: " + tokens[0]) ;
            System.out.print("\t Length: " + tokens.length) ;
            System.out.print("\t Last Value: " + tokens[tokens.length - 1] + "\n") ;
        }
    }
}
