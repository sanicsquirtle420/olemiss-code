import java.io.FileNotFoundException;
import java.util.ArrayList ;
import java.util.Collections;
import java.util.Scanner ;
import java.io.File ;

public class PreLab5 {
    private ArrayList<String> numToSort ;
    private Scanner scan ;

    public PreLab5(String filename) throws FileNotFoundException {
        scan = new Scanner (new File(filename)) ;
        numToSort = new ArrayList<>() ;
    }

    public ArrayList<String> getArray() {
        return numToSort ;
    }

    public void getValues() {
        while(scan.hasNext()) {
            String[] s = scan.nextLine().split(",") ;
            for(int i = 0 ; i < s.length ; i++) {
                while(s[i].length() != 8) {
                    s[i] = "0" + s[i] ;
                }

                numToSort.add(s[i]) ;
            }
        }
    }

    // TODO: fix these awful radix sort methods
    public void radixSort() {
        int max = 8 ;

        for(int pos = max - 1 ; pos >= 0 ; pos--) {
            countSort(pos , max) ;
        }
    }

    // max variable isn't being used
    private void countSort(int position , int max) {
        ArrayList<String> output = new ArrayList<>(Collections.nCopies(numToSort.size() , "")) ;
        ArrayList<Integer> count = new ArrayList<>(Collections.nCopies(256 , 0)) ;

        for(String str : numToSort) {
            char ch = str.charAt(position) ;
            count.set(ch , count.get(ch + 1)) ;
        }

        for(int i = 1 ; i < 256 ; i++) {
            count.set(i , count.get(i) + count.get(i - 1)) ;
        }

        for(int i = numToSort.size() - 1 ; i >= 0 ; i--) {
            char ch = numToSort.get(i).charAt(position) ;
            int j = count.get(ch) - 1 ;
            output.set(j , numToSort.get(i)) ;
            count.set(ch , count.get(ch) - 1) ;
        }

        for(int i = 0 ; i < numToSort.size() ; i++) {
            numToSort.set(i , output.get(i)) ;
        }
    }

    @Override
    public String toString() {
        String msg = "" ;

        for(String str : numToSort) {
            msg += str + "\n" ;
        }

        return msg ;
    }
}
