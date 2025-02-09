import java.util.Stack;

public class PreLab3 {
    private Stack<Marble> marbleStack = new Stack<>() ;

    public void addTop(Marble m) {
        marbleStack.add(m) ;
    }

    public Marble removeTop() throws InvalidMarbleException {
        if(marbleStack.isEmpty()) {
            throw new InvalidMarbleException("No marbles") ;
        }
        return marbleStack.pop() ;
    }

    @Override
    public String toString() {
        String msg = "";
        if(marbleStack.isEmpty()) {
            return "" ;
        }
        for(int i = marbleStack.size() - 1 ; i > 0 ; i--) {
            msg += marbleStack.get(i).toString() + "\n" ;
        }
        return msg ;
    }
}
