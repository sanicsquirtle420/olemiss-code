// 02-26-2025

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RadixSortHTML {
    private ArrayList<LinkedQueue<String>> buckets;
    ArrayList<String> tags;
    private String filename;
    private int passes;
    public RadixSortHTML(String filename) {
        this.filename = filename;
        this.buckets = new ArrayList<LinkedQueue<String>>();
        this.tags = new ArrayList<>();
        this.passes = 0;

        initializeBuckets();
    }
    public void initializeBuckets() {
        // 26 Letters AND a space
        for(int i = 0; i < 27; i++) {
            buckets.add(new LinkedQueue<>());
        }
    }

    public int getPasses() {
        return passes;
    }

    public void readTags() throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filename)) ;

        while(scan.hasNextLine()) {
            tags.add(scan.nextLine()) ;
        }
    }

    public void processTags() throws FileNotFoundException {
        int max = 0 ;
        for(String str : tags) {
            if(str.length() > max) {
                max = str.length() ;
            }
        }

        for(int i = 0 ; i < tags.size() ; i++) {
            while(tags.get(i).length() != max) {
                tags.set(i , tags.get(i) + " ") ;
            }
        }
    }

    public void sort() throws FileNotFoundException {
        int max = tags.get(0).length() ;

        for(int pos = max - 1 ; pos >= 0 ; pos--) {
            countSort(pos) ;
        }
    }

    public void countSort(int position) {
        int n = tags.size() ;

        for(String str : tags) {
            int letter = str.charAt(position) - 'a' ;

            if(letter == -65) {
                buckets.get(26).enqueue(str) ;
            }
            else if(letter >= 0 && letter <= 25) {
                buckets.get(letter).enqueue(str) ;
            }
            else {
                throw new InvalidRadixSortException("invalid index") ;
            }
        }

        passes = 0 ;
        for(int i = 0 ; i <= 26 ; i++) {
            while(!buckets.get(i).isEmpty()) {
                tags.set(passes , buckets.get(i).dequeue()) ;
                passes++ ;
            }
        }
    }

    @Override  
    public String toString() {
        String output = "";
        for(String oneTag: tags)
            output += oneTag + "\n";
        return output;
    }
}
