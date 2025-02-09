public class Juno {
    public static void main(String[] args) throws InvalidMarbleException {
        Marble juno = new Marble() ;
        System.out.println(juno) ;

        PreLab3 stack = new PreLab3() ;
        for(int i = 0 ; i < 10 ; i++) {
            stack.addTop(new Marble()) ;
        }

        System.out.println("My stack of marbles:\n" + stack) ;
        System.out.println("\nVerifying stack elements:\n" + stack) ;

        System.out.println("\n Remove " + stack.removeTop()) ;
        System.out.println("\n Remove " + stack.removeTop()) ;

        System.out.println("\nRemove remaining marbles: ") ;
        for(int i = 0 ; i < 9 ; i++) {
            System.out.println(stack.removeTop()) ;
        }
    }
}
