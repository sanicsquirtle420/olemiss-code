import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Prelab11 {
    private String filename;
    ArrayList<Word> myWords;
    private final int BASE = 37;
    private ArrayList<LinkedUnorderedList<Word>> hash;

    public Prelab11(String filename) {
        this.filename = filename;
        myWords = new ArrayList<>();
        hash = new ArrayList<LinkedUnorderedList<Word>>();

    }

    public boolean searchHash(String word) {
        int power = word.length()-1;
        long hashCode=0;

        for(int i = 0 ; i < power ; i++) {
            hashCode += (long) (word.charAt(i) * Math.pow(BASE, power));
        }
        int index = (int) (hashCode % hash.size()) ;
        LinearNode<Word> current = hash.get(index).getListHead() ;
        while(current != null) {
            Word w = current.getElement() ;
            if(w.getWord().equalsIgnoreCase(word)) {
                return true ;
            }
            current = current.getNext() ;
        }

        return false;
    }

    public void add(String word) {
        int power = word.length()-1;
        long hashCode=0;
        for(int i = 0 ; i < power ; i++) {
            hashCode += (long) (word.charAt(i) * Math.pow(BASE, power));
        }
        int index = (int) (hashCode % hash.size()) ;
        if(!searchHash(word)) {
            hash.get(index).addToRear(new Word(word, hashCode)) ;
        }
    }
}
