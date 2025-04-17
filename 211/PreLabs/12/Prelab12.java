import java.util.Random ;
import java.util.Arrays ;

public class Prelab12 {
    public static void main(String[] args) {
        Random rand = new Random() ;
        double[] luna = new double[5] ;
        double[][] kiriko = new double[5][4] ;

        for(int i = 0 ; i < luna.length ; i++) {
            // initializing 1D array
            luna[i] = 5000.0 + rand.nextDouble(499999.9) ;
        }

        for(int x = 0 ; x < kiriko.length ; x++) {
            for(int y = 0 ; y < kiriko[x].length ; y++) {
                // initializing 2D array
                kiriko[x][y] = 5000.0 + rand.nextDouble(499999.9) ;
            }
        }

        double[] susan = modify(Arrays.copyOf(luna, luna.length)) ;
        double[][] juno = new double[kiriko.length][kiriko[0].length] ;

        for(int i = 0 ; i < juno.length ; i++) {
            juno[i] = modify(Arrays.copyOf(kiriko[i], kiriko[i].length)) ;
        }

        System.out.println("*** ORIGINAL ***\nLuna:") ;
        printArray(luna) ;
        System.out.println("\nKiriko:") ;
        printArray(kiriko) ;

        System.out.println("\n*** ALTERED ***\nSusan:") ;
        printArray(susan) ;
        System.out.println("\nJuno:") ;
        printArray(juno) ;

        System.out.println("\n*** AVERAGES ***\nKiriko:") ;
        printArray(average(kiriko)) ;
        System.out.println("\nJuno:") ;
        printArray(average(juno)) ;
    }

    static void printArray(double[] array) {
        for (double n : array) {
            System.out.printf("%.3f ", n) ;
        }
        System.out.println() ;
    }

    static void printArray(double[][] array) {
        for(int x = 0 ; x < array.length ; x++) {
            for(int y = 0 ; y < array[x].length ; y++) {
                System.out.printf("%.3f " , array[x][y]) ;
            }
            System.out.println() ;
        }
    }

    static double[] modify(double[] array) {
        for(int i = 0 ; i < array.length ; i++) {
            if((int) array[i] % 2 == 0) {
                array[i] = array[i] * 2 ;
            } else {
                array[i] = array[i] * 3 ;
            }
        }

        return array ;
    }

    static double[] average(double[][] array) {
        double[] average = new double[array.length] ;
        for(int x = 0 ; x < array.length ; x++) {
            double sum = 0.0 ;
            for(int y = 0 ; y < array[x].length ; y++) {
                sum += array[x][y] ;
            }
            average[x] = sum / array[x].length ;
        }
        return average ;
    }
}
