package edu.olemiss.week12 ;

import java.io.* ; // fight me for using * 
import java.util.Scanner ;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("data.txt") ;
        pw.println("On a new line !") ;
        Scanner scan = new Scanner(System.in) ;

        System.out.print("Text: ") ;
        String str = scan.nextLine() ;

        pw.printf("The user typed: %s" , str) ;

        pw.close() ;

        System.out.println("Text was written to data.txt") ;
    }
}
