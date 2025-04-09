import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class PreLab10 {
    private String filename;
    ArrayList<Word> myWords;
    private final int BASE = 37;
    private ArrayList<LinkedUnorderedList<Word>> hash;

    public PreLab10(String filename) {
        this.filename = filename;
        myWords = new ArrayList<>();
        hash = new ArrayList<LinkedUnorderedList<Word>>();
    }

    ///////////////  PRE-LAB 10  //////////////////
    public void process() throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filename)) ;
        while(scan.hasNextLine()) {
            myWords.add(new Word(scan.nextLine().toLowerCase())) ;
        }
        // Sorts the myWords ArrayList
        Collections.sort(myWords, new SortbyWord()) ;
    }

    public int binarySearch(ArrayList<Word> list, int min, int max, Word target) {
        int index = -1;
        if(list.isEmpty()) {
            return index ;
        }
        if (min > max || min < 0 || max >= list.size()) {
            return -1;
        }

        int mid = (min + max) / 2 ;
        int comp = list.get(mid).compareTo(target) ;

        if(comp == 0) {
            index = mid ;
        }
        else if(comp > 0) {
            index = binarySearch(list, min, mid - 1, target) ;
        }
        else {
            index = binarySearch(list, mid + 1, max, target) ;
        }

        return index;
    }

    public void hashWords() {
        int power;
        long hashCode;
        //TODO:   Determine the hash code for each word in "myWords". Once determined, update the Word object by
        //       calling the .setHash(hashCode) with this hash code.
    }



    public void hashIndexes() {
        //TODO:    Instantiate "hash" (an ArrayList of 11 linked lists) - you may hard-code 11 in your for-loop
        //      Now, for each word in "myWords", calculate the hash index and add to the corresponding linked list in "hash"
    }

    private class SortbyWord implements Comparator<Word> {
        // Used for sorting in ascending order by letter
        public int compare(Word a, Word b) {
            return a.getWord().compareTo(b.getWord());
        }
    }

    public ArrayList<Word> getMyWords() {
        return myWords;
    }

    public String printWords() {
        String output = "";
        for(Word one: myWords)
            output += one.getWord() + "\n";
        return output;
    }

    public String printWordsAndHash() {
        String output = "";
        for(Word one: myWords)
            output += one.getWord() + ": " + one.getHash() + "\n";
        return output;
    }

    public String printHashTable() {
        String output = "";
        int count;
        LinearNode<Word> current;
        for(int i = 0; i < hash.size(); i++) {
            output += i + ": ";
            current = hash.get(i).head;
            count = 0;
            if (current != null){
                while(current != null) {
                    //separates words with ->
                    if(count > 0) {
                        output += "-> ";
                    }
                    output +=  current.getElement().getWord();
                    current = current.getNext();
                    count++;
                }
                output += "\n";
            }
        }
        return output;
    }
}
