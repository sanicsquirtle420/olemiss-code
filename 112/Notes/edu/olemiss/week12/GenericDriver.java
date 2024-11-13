package edu.olemiss.week12;

import java.util.ArrayList ;
import java.util.Arrays ;

public class GenericDriver {
    @SuppressWarnings("rawTypes")
    public static void main(String[] args) {
        Generic<Integer> num = new Generic<>() ;
        num.setElement(428) ;

        num.setNext(new Generic("welcome to orbit")) ;

        Generic<Integer> two = num.getNext() ;
        two.setNext(new Generic(4.28)) ;

        System.out.println(num.toString()) ;

        System.out.println() ;
        Generic<Integer> current = num ;
        while(current.getNext() != null) {
            System.out.println(current) ;
            current = current.getNext() ;
        }

        ArrayList<Generic> multi = new ArrayList<Generic>() ;
        multi.add(new Generic(83)) ;
        multi.add(new Generic("let the kitsune guide you")) ;

        System.out.println() ;
        for(Generic g : multi) {
            System.out.println(g.toString()) ;
        }

        System.out.println() ;
        int[] values = {1 , 2 , 3 , 4 , 5 , 6} ;
        values = Arrays.copyOf(values , values.length * 2) ;

        for(int i = 0 ; i < values.length ; i++) {
            System.out.printf("%d\t" , values[i]) ;
        }
    }
}
