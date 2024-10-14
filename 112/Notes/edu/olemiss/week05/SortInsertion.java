package edu.olemiss.week05 ;

import java.util.ArrayList ;

public class SortInsertion {
    private int[] numbers = {72, 4, 37, 83, 9, 43, 17, 28, 7, 1, 55, 61} ;

    public void printArray() {
        for(int i = 0 ; i < numbers.length - 1 ; i++) {
            System.out.printf("%d: %d" , i , numbers[i]) ;
        }
    }

    public void insertionSort() {
        for(int outer = 1 ; outer < numbers.length ; outer++) {
            int k = numbers[outer] ; // 1
            int i = outer - 1 ;

            while((i > -1) && (numbers[i] > k)) {
                numbers[i+1] = numbers[i] ;
                i-- ;
            }

            numbers[i+1] = k ;
        }
    }

    public static void main(String[] args) {
        SortInsertion test = new SortInsertion() ;
        test.insertionSort() ;
        System.out.println("Insertion Sort:") ;
        test.printArray() ;
    }
}
