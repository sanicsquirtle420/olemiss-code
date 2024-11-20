import java.util.ArrayList ;

public class Lab9Driver {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        Node<Integer> sample = new Node<>() ;
        sample.setElement(5) ; // 3i

        Node<String> sample2 = new Node<>() ;
        sample2.setElement("Binsa") ; // 3ii

        Node<Double> sample3 = new Node<>() ;
        sample3.setElement(4.37) ; // 3iii

        System.out.println(sample) ;
        System.out.println(sample2) ;
        System.out.println(sample3) ; // 3iv
        System.out.println() ;

        ArrayList<Node> nodes = new ArrayList<>() ;
        nodes.add(new Node<>(6)) ;
        nodes.add(new Node<>("Amir")) ;
        nodes.add(new Node<>(36.72)) ; // 3v

        for(int i = 0 ; i < nodes.size() ; i++) {
            System.out.println(nodes.get(i).toString()) ;
        } // 3vi

        System.out.println() ;
        Node<Integer> sample4 = new Node<>(15) ;
        sample4.setNext(new Node("Stef")) ;

        System.out.println(sample4.toString()) ;
        System.out.println(sample4.getNext()) ;
    }
}
