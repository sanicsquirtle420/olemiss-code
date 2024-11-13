package edu.olemiss.week12;

import java.io.FileWriter ;
import java.io.IOException;
import java.io.PrintWriter ;

public class WriteTwo {
    public static void main(String[] args) throws IOException {
        // Appending to a file that already has data
        FileWriter file = new FileWriter("sample-data.txt" , true) ;
        PrintWriter pw = new PrintWriter(file) ;

        pw.println("\nAppended !") ;
        pw.println("Welcome to orbit!") ;

        pw.close() ;

        System.out.println("Text was appended to sample-data.txt") ;
    }
}
