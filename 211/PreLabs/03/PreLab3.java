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
        String msg = "" ;
        Stack<Marble> tmp = new Stack<>() ;

        if(marbleStack.isEmpty()) {
            return "" ;
        }
        while(!marbleStack.isEmpty()) {
            tmp.add(marbleStack.pop()) ;
        }

        while(!tmp.isEmpty()) {
            msg += tmp.peek().toString() + "\n" ;
            marbleStack.add(tmp.pop()) ;
        }
        return msg ;
    }
}
