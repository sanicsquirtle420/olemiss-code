import java.util.Stack ;

public class PreLab4 {
  private Stack<Marble> marbleStack = new Stack<>() ;

    /** The methods from PreLab3.java are needed to make this code work */
    public void addBottom(Marble m) {
        marbleStack.push(m) ;
    }

    // TODO: make this method add the Marble before the first one it finds with the same color
    public void addByColor(Marble m, String color) throws InvalidMarbleException {
        boolean found = false ;
        for(Marble kiriko : marbleStack) {
            if(kiriko.getColor().equals(color)) {
                found = true ;
                marbleStack.push(m) ;
                break ;
            }
        }
        if(!found) {
            throw new InvalidMarbleException("Invalid color") ;
        }
    }

    public void sortByColor() {
        // write method
    }
}
