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

        // could be its own method
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

    // thank fuck this shit works, and i hate this sorting method some much
    public void radixSort() {
        int max = numToSort.getFirst().length() ;

        for(int pos = max - 1 ; pos >= 0 ; pos--) {
            countSort(pos) ;
        }
    }

    public void countSort(int position) {
        int n = numToSort.size() ;
        ArrayList<String> result = new ArrayList<>(Collections.nCopies(n , "")) ;
        int[] c = new int[10] ;

        for(String str : numToSort) {
            int digit = str.charAt(position) - '0' ;
            c[digit]++ ;
        }

        for(int i = 1 ; i < 10 ; i++) {
            c[i] += c[i - 1] ;
        }

        for(int i = n - 1 ; i >= 0 ; i--) {
            // fuck you piece of shit >= because you ruined everything
            String num = numToSort.get(i) ;
            int digit = num.charAt(position) - '0' ;
            result.set(c[digit] - 1, num) ;
            c[digit]-- ;
        }

        for(int i = 0 ; i < n ; i++) {
            numToSort.set(i , result.get(i)) ;
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
