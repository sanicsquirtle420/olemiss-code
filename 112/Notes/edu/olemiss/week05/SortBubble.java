package edu.olemiss.week05 ;

public class SortBubble {
    private int[] numbers = {72, 4, 37, 83, 9, 43, 17, 28, 7, 1, 55, 61} ;

    public void bubbleSort() {
        int temp = 0 ; // temp value for the swap

        for(int out = 0 ; out < numbers.length ; out++) {
            // starts at the first index
            for(int in = 1 ; in < (numbers.length - out) ; in++) {
                // starts at the second index
                if(numbers[in - 1] > numbers[in]) {
                    // tests the value of the previous cell to the current cell
                    temp = numbers[in - 1] ; // previous value to temp
                    numbers[in - 1] = numbers[in] ; // current value to the previous cell
                    numbers[in] = temp ; // temp value to the current cell
                }
            }
        }
    }

    public void printArray() {
        for(int i = 0 ; i < numbers.length ; i++) {
            if((i + 1) % 6 == 0) {
                System.out.printf("%d: %d\n", i, numbers[i]);
            }
            else {
                System.out.printf("%d: %d\t" , i , numbers[i]) ;
            }
        }
    }

    public static void main(String[] args) {
        SortBubble test = new SortBubble() ;

        test.bubbleSort() ; // does the sort
        test.printArray() ; // prints the sort
    }
}

