import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner ;
import java.io.File ;

public class PreLab6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner juno = new Scanner(new File("samplePeople.txt")) ;
        LinkedUnorderedList<Person> kiriko = new LinkedUnorderedList<>() ;

        while(juno.hasNextLine()) {
            String[] tokens = juno.nextLine().split(",") ;
            kiriko.addToRear(new Person(tokens[0] , Integer.parseInt(tokens[1]) , tokens[2])) ;

        }

        LinkedUnorderedList<Person> luna = copy(kiriko) ;

        if(kiriko != luna) {
            System.out.println("I am ready to put on a show!" ) ;
        } else {
            System.out.println("YOU FUCKED UP: Let the kitsune guide you!") ;
        }

        kiriko.addToFront(new Person("Kiriko" , 21 , "female")) ;
        luna.addToFront(new Person("Luna" , 22 , "female")) ;

        System.out.println("KIRKO:\n" + kiriko) ;
        System.out.println("LUNA:\n" + luna) ;

        if(isEquals(kiriko , luna)) {
            System.out.println("Overwatch is better") ;
        } else {
            System.out.println("Marvel Rivals is the best game ever and will destory Overwatch") ;
        }

        if(inList(luna , "UNA")) {
            System.out.println("Welcome to orbit!") ;
        } else {
            System.out.println("Oh moons not again!") ; // Juno <3
        }
    }

    public static LinkedUnorderedList<Person> copy(LinkedUnorderedList<Person> sample) {
        LinkedUnorderedList<Person> tmp = new LinkedUnorderedList<>() ;
        LinearNode<Person> current = sample.getListHead() ;

        while(current != null) {
            tmp.addToRear(current.getElement()) ;
            current = current.getNext() ;
        }

        return tmp ;
    }

    public static boolean isEquals(LinkedUnorderedList<Person> one , LinkedUnorderedList<Person> two) {
        LinearNode<Person> oneNode = one.getListHead() ;
        String oneStr = oneNode.getElement().toString() ;
        LinearNode<Person> twoNode = two.getListHead() ;
        String twoStr = twoNode.getElement().toString() ;


        while(oneNode != null || twoNode != null) {
            if(!Objects.equals(oneStr , twoStr)) {
                return false ;
            }
            oneNode = oneNode.getNext() ;
            twoNode = twoNode.getNext() ;
            oneStr = oneNode.getElement().toString() ;
            twoStr = twoNode.getElement().toString() ;
        }

        return true ;
    }

    public static boolean inList(LinkedUnorderedList<Person> sample , String find) {
        LinearNode<Person> current = sample.getListHead() ;

        while(current != null) {
            String sampleStr = current.getElement().getName().toLowerCase() ;
            find = find.toLowerCase() ;
            if(sampleStr.contains(find)) {
                return true ;
            }

            current = current.getNext() ;
        }

        return false ;
    }
}
