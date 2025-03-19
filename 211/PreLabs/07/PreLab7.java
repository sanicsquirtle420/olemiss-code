import java.io.FileNotFoundException;
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
        System.out.println("Kiriko:\n" + kiriko) ;
        removeMales(kiriko) ;
        System.out.println("Kiriko (without Males):\n" + kiriko) ;

        add(kiriko , "samplePeople2.txt") ;
        System.out.println("Kiriko (add method):\n" + kiriko) ;
    }

    public static void removeMales(LinkedUnorderedList<Person> lst) {
        LinearNode<Person> current = lst.getListHead() ;
        LinearNode<Person> previous = null ;

        while(current != null) {
            if(current.getElement().getGender().equalsIgnoreCase("male")) {
                if(previous == null) {
                    // removes the head node
                    lst.head = current.getNext() ;
                } else {
                    // skips the current node
                    previous.setNext(current.getNext()) ;
                }
                lst.count-- ;
                lst.modCount++ ;
            } else {
                // Move previous forward only if nothing is removed
                previous = current ;
            }

            current = current.getNext() ;
        }
    }

    public static void add(LinkedUnorderedList<Person> lst , String filename) throws FileNotFoundException {
        removeMales(lst) ; // removing Males

        LinearNode<Person> current = lst.getListHead() ;
        LinearNode<Person> previous = null ;

        Scanner scan = new Scanner(new File(filename)) ;

        while(scan.hasNextLine()) {
            String[] token = scan.nextLine().split(",");
            while(current != null) {
                Person cmp = new Person(token[0], Integer.parseInt(token[1]), token[2]);

                if(!perEquals(current.getElement(), cmp)) {
                    if(previous == null) {
                        lst.addToRear(cmp);
                    } else {
                        lst.addAfter(cmp, previous.getElement());
                        previous = new LinearNode<>(cmp) ;
                    }
                } else {
                    previous = current ;
                    current = current.getNext() ;
                }
                break ;
            }
        }
    }

    public static boolean perEquals(Person one , Person two) {
        return one.getAge() == two.getAge()  &&
                one.getName().equalsIgnoreCase(two.getName()) &&
                one.getGender().equalsIgnoreCase(two.getGender()) ;
    }
}
