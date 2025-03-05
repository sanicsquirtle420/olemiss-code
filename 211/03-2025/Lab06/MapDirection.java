// 03-05-2025
import java.io.FileNotFoundException;
import java.util.Scanner ;
import java.io.File ;

public class MapDirection {
    private String filename ;
    private LinkedUnorderedList<OneMapDirection> directions ;

    public MapDirection(String filename) {
        this.filename = filename ;
        directions = new LinkedUnorderedList<>() ;
    }

    public LinkedUnorderedList<OneMapDirection> getDirections() {
        return directions ;
    }

    @Override
    public String toString() {
        String msg = "" ;
        LinearNode<OneMapDirection> current = directions.getListHead() ;
        String desc  , dist ;

        while(current != null) {
            desc = current.getElement().getDescription() ;
            dist = current.getElement().getDistance() ;

            msg += desc + " (" + dist + ")\n" ;

            current = current.getNext() ;
        }

        return msg ;
    }

    public void build() throws FileNotFoundException {
       Scanner scan = new Scanner(new File(filename)) ;

       while(scan.hasNextLine()) {
           String[] tokens = scan.nextLine().split(",") ;
           directions.addToRear(new OneMapDirection(Integer.parseInt(tokens[0]) , tokens[1] , tokens[2])) ;
       }
    }

    public LinkedUnorderedList<OneMapDirection> copy() {
        LinkedUnorderedList<OneMapDirection> tmp = new LinkedUnorderedList<>() ;
        LinearNode<OneMapDirection> current = directions.getListHead() ;

        while(current != null) {
            tmp.addToRear(current.getElement()) ;
            current = current.getNext() ;
        }

        return tmp ;
    }

    public String find(String target) {
        String currStr ;
        target = target.toLowerCase() ;
        LinearNode<OneMapDirection> current = directions.getListHead() ;

        while(current != null) {
            currStr = current.getElement().getDescription().toLowerCase() ;
            if(currStr.contains(target)) {
                return current.getElement().getDescription() ;
            }

            current = current.getNext() ;
        }

        return "" ;
    }
}
