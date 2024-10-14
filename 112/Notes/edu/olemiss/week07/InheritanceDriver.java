package edu.olemiss.week07;

import java.util.Scanner ;

public class InheritanceDriver {
    static Scanner keyboard = new Scanner(System.in) ;

    public static void main(String[] args) {
        /** Inheritance */
        System.out.println("Inheritance:") ;
        Mammal updog = new Mammal() ;
        updog.print() ;
        System.out.println() ;

        Dog shelby = new Dog(true , "smell" , false) ;
        shelby.print() ;
        System.out.println() ;

        Poodle crusty = new Poodle("White" , "curly" , true , "sight") ;
        System.out.println("The poodle hunts by " + crusty.getHuntingType()) ;
        System.out.println("The poodle is a family pet " + crusty.isPet()) ;
        crusty.print() ;

        /** Polymorphism */
        System.out.println("Polymorphism: ") ;
        Mammal juno = new Dog(true , "smell" , false) ;
        juno.print() ;
        System.out.println() ;
        System.out.println("Juno hunts by " + ((Dog)juno).getHuntingType()) ;
        // have to tell it to act as the "dog" class to call classes from the dog
        // class

        Mammal[] mams = new Mammal[5] ;
        mams[0] = new Mammal() ;
        mams[1] = new Dog() ;
        mams[2] = new Fox() ;
        mams[3] = new Poodle() ;
        /** with polymorphism, you can have the subclasses in an array
            based on the base class but NOT the other way around */
    }
}
