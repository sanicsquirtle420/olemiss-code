// 09/18/24
import java.util.ArrayList ;
import java.util.Random ;
import java.text.DecimalFormat ;

public class Practice {
    private ArrayList<Integer> times = new ArrayList<>() ;
    private Random rand = new Random() ;
    private int[][] nums2d = new int[7][11] ;


    public void addIntToArray(int j) {
        for(int i = 0 ; i < j ; i++) {
            times.add(i , rand.nextInt(95 - 35 + 1) + 35) ;
        }

        System.out.printf("The length of the array times is %d\n" , times.size()) ;
    }

    public void standardFor() {
        for(int i = 0 ; i < times.size() ; i++) {
            System.out.println(times.get(i)) ;
        }
    }

    public void changeInt() {
        times.remove(12) ;
        times.remove(9) ;
        times.remove(5) ;
        times.remove(3) ;

        times.add(6 , 70) ;
        times.set(2 , 99) ;

        System.out.printf("The length of the array is %d\n" , times.size()) ;
    }

    public void enhancedFor() {
        for (int t : times) {
            System.out.println(t);
        }
    }

    ArrayList<String> two = new ArrayList<>() ;
    public void addStrToArray(String s) {
        two.add(s) ;
    }

    public void normalStr() {
        for(String s : two) {
            System.out.printf("%s " , s) ;
        }
    }

    public void reverseStr() {
        for(int i = two.size() - 1 ; i >= 0 ; i--) {
            System.out.printf("%s " , two.get(i)) ;
        }
    }

    public void FirstLength() {
        for(int i = 0 ; i < two.size() ; i++) {
            System.out.printf("%s , %d\n" , two.get(i).charAt(0), two.get(i).length()) ;
        }
    }

    public void EvenNum() {
        for (int i = 0 ; i < times.size() ; i++) {
            if(times.get(i) % 2 == 0) {
                System.out.println(times.get(i)) ;
            }
        }
    }

    public void addInt2DArray() {
        for (int row = 0; row < nums2d.length; row++) {
            for (int col = 0; col < nums2d[row].length ; col++) {
                nums2d[row][col] = rand.nextInt(85 - 25 +1) + 25 ;
            }
        }
    }

    public void printRowCol() {
        for (int row = 0; row < nums2d.length; row++) {
            System.out.println() ;
            for (int col = 0; col < nums2d[row].length ; col++) {
                System.out.printf("%d " , nums2d[row][col]) ;
            }
        }
    }

    public void printColRow() {
        for (int col = 0; col < 11 ; col++) {
            System.out.println() ;
            for (int row = 0; row < nums2d.length ; row++) {
                System.out.printf("%d " , nums2d[row][col]) ;
            }
        }
    }

    public void DecForPrintF(double d) {
        DecimalFormat dec = new DecimalFormat("#.00") ;
        System.out.println("The Decimal Format version is " + dec.format(d)) ;
        System.out.printf("printf Match %.2f" , d) ;
        System.out.printf("\nprintf with commas %,.2f" , d) ;
    }

    public void PrintFvsStrFor(String a , String b , String c) {
        System.out.printf("printf Right %11s %11s %11s" , a , b , c) ;
        System.out.printf("\nprintf Left %-8s %-8s %-8s" , a, b , c) ;

        String out1 = String.format("String Right  %11s %11s %11s" , a , b , c) ;
        String out2 = String.format("String Left %-8s %-8s %-8s" , a, b , c) ;

        System.out.printf("\n%s" , out1) ;
        System.out.printf("\n%s" , out2) ;
    }
}
