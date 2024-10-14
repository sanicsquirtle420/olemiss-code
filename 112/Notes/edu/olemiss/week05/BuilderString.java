package edu.olemiss.week05 ;
import java.util.Scanner;

public class BuilderString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = "Bob";
        name = "Ayesha";

        // by changing what name stores, a new memory location
        //  must be created for the new value.

        StringBuilder words = new StringBuilder();
        StringBuilder words2 = new StringBuilder("data");

        /** add data using the append method */
        words.append("Hello");

        System.out.println(words);
        System.out.println();

        /** the length method */
        System.out.println(words.length());

        words.append(" World");

        System.out.println(words);
        System.out.println(words.length());

        /** insert */
        words.insert(5, " huge");
        System.out.println(words);

        /** a different example */
        StringBuilder phrase = new StringBuilder("Luke, am your ");
        phrase.insert(6, "I ");
        // phrase.insert(16, "Father!"); // you could count to add this at the end or
        phrase.append("Father!"); // simply use append
        System.out.println();
        System.out.println(phrase);

        /** replace */
        words.replace(6, 10, "ah");
        System.out.println(words);
        words.replace(6, 8, "cruel");
        System.out.println(words);

        /** delete */
        words.delete(5, 11);
        System.out.println(words);

        /** reverse */
        words.reverse();
        System.out.println(words);

        /** back to the original order */
        words.reverse();
        System.out.println(words);

        /** convert a StringBuilder object into a regular String */
        String str = words.toString();

        /** convert a String to a StringBuilder */
        StringBuilder s2 = new StringBuilder(str);
    }
}
