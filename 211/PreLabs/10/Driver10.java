import java.io.FileNotFoundException;

public class Driver10 {
    public static void main(String[] args) throws FileNotFoundException {
        /** Missing Part 1 of PreLab because PreLab10.java wasn't provided */
      
        /* Part 2 of PreLab */
        Rectangle kiriko = new Rectangle(1.11, 2.22) ;
        Rectangle juno = new Rectangle(3.33, 4.44) ;
        Rectangle luna = new Rectangle(5.55, 6.66) ;
      
        System.out.println("Printing reference:") ;
        System.out.println("Kiriko: " + kiriko) ;
        System.out.println("Juno: " + juno) ;
        System.out.println("Luna: " + luna) ;

        System.out.println("\nCalling printReference():") ;
        kiriko.printReference() ;
        juno.printReference() ;
        luna.printReference() ;

        System.out.println("\nHashing:") ;
        System.out.println("Kiriko: " + kiriko.rectangleHash()) ;
        System.out.println("Juno: " + juno.rectangleHash()) ;
        System.out.println("Luna: " + luna.rectangleHash()) ;
    }
}
