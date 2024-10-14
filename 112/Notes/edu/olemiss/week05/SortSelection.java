package edu.olemiss.week05 ;

public class SortSelection {
    private int[] numbers = {72, 4, 37, 83, 9, 43, 17, 28, 7, 1, 55, 61} ;

    public void selectionSort() {
        int iOfSmallVal ;
        int smallVal ;

        for(int outer = 0 ; outer < numbers.length - 1 ; outer++) {
            iOfSmallVal = outer ;
            smallVal = numbers[outer] ;
            for(int inner = outer + 1 ; inner < numbers.length ; inner++) {
                if (numbers[inner] < smallVal) {
                    smallVal = numbers[inner] ;
                    iOfSmallVal = inner ;
                }
            }
            numbers[iOfSmallVal] = numbers[outer] ; // move the larger value further down the array
            numbers[outer] = smallVal ; // place the smallest value toward the front of the array
        }
    }

    public void printArray() {
        for(int i = 0 ; i < numbers.length - 1 ; i++) {
            System.out.printf("%d: %d\t", i, numbers[i]);
        }
    }

    public static void main(String[] args) {
        SortSelection test = new SortSelection() ;
        test.selectionSort() ;

        test.printArray() ;
    }
}
