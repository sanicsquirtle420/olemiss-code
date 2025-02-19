import java.util.Stack ;

public class PreLab4 {
  private Stack<Marble> marbleStack = new Stack<>() ;

    /** The methods from PreLab3.java are needed to make this code work */
    public void addBottom(Marble m) {
        marbleStack.push(m) ;
    }

    // TODO: make this method add the Marble before the first one it finds with the same color
    public void addByColor(Marble m, String color) throws InvalidMarbleException {
        Stack<Marble> tmp = new Stack<>() ;
        boolean insert = false ;

        while(!marbleStack.isEmpty()) {
            Marble t = marbleStack.pop() ;
            if(!insert && t.getColor().equals(color)) {
                marbleStack.push(m);
                insert = true;
            }
            tmp.push(t) ;
        }
        while(!tmp.isEmpty()) {
            marbleStack.push(tmp.pop()) ;
        }
        if(!insert) {
            throw new InvalidMarbleException("Invalid color") ;
        }
    }

    public void sortByColor() {
        ArrayList<Marble> marList = new ArrayList<>(marbleStack) ;
        marList.sort(Comparator.comparing(Marble :: getColor)) ;

        marbleStack.clear() ;
        for(int i = marList.size() - 1; i > 0 ; i--) {
            marbleStack.push(marList.get(i)) ;
        }
    }
}
