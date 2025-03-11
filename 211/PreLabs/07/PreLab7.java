import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;

public class PreLab7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("samplePeople.txt")) ;
        LinkedUnorderedList<Person> kiriko = new LinkedUnorderedList<>() ;

        while(scan.hasNextLine()) {
            String[] token = scan.nextLine().split(",") ;
            kiriko.addToRear(new Person(token[0] , Integer.parseInt(token[1]) , token[2])) ;
        }

        removeMales(kiriko) ;
        System.out.println("Kiriko:\n" + kiriko) ;

        add(kiriko , "samplePeople2.txt") ;
        System.out.println("Kiriko After:\n" + kiriko) ;
    }

    public static void removeMales(LinkedUnorderedList<Person> lst) {
        LinearNode<Person> current = lst.getListHead() ;

        while(current != null) {
            if(Objects.equals(current.getElement().getGender(), "male")) {
                lst.remove(current.getElement()) ;
            }

            current = current.getNext() ;
        }
    }

    public static void add(LinkedUnorderedList<Person> lst , String filename) throws FileNotFoundException {
      // TODO: fix NullPointerException and this method
        LinearNode<Person> current = lst.getListHead() ;
        LinearNode<Person> previous = null ;

        Scanner scan = new Scanner(new File(filename)) ;

        while(current != null) {
            // System.out.println("Juno") ;
            while(scan.hasNextLine()) {
                // System.out.println("Kiriko") ;
                String[] token = scan.nextLine().split(",");
                if (!Objects.equals(current.getElement().getName(), token[0])) {
                    lst.addAfter(new Person(token[0], Integer.parseInt(token[1]), token[2]), previous.getElement());
                }
            }
            previous = current;
            current = current.getNext();
        }
    }
}
