package edu.olemiss.week12;

import java.io.* ;
import java.util.Scanner ;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in) ;
        System.out.print("Enter a file name: ") ;
        String name = scan.nextLine() ;

        PrintWriter pw = new PrintWriter(name + ".txt") ;
        pw.println("On a new line !") ;


        System.out.print("Text: ") ;
        String str = scan.nextLine() ;

        pw.printf("The user typed: %s" , str) ;

        pw.close() ;

        System.out.printf("Text was written to %s.txt" , name) ;
    }
}
