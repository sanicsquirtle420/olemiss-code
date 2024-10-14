package edu.olemiss.week05 ;

public class SearchBinary {
    private int[] numbers = {2, 4, 5, 7, 9, 13, 17, 18, 27, 31, 55, 61} ;

    private int binarySearch(int val) {
        int firstIndex = 0 ;
        int lastIndex = numbers.length - 1 ;
        int middleIndex ;
        int position = -1 ;
        boolean found = false ;

        while(!found && firstIndex <= lastIndex){
            middleIndex = (firstIndex + lastIndex) / 2 ;

            if(numbers[middleIndex] == val) {
                found = true ;
                position = middleIndex ;
            }
            else if(numbers[middleIndex] > val){
                lastIndex = middleIndex - 1 ;
            }
            else{
                firstIndex = middleIndex + 1 ;
            }
        }
        return position ;
    }

    public static void main(String[] args) {
        SearchBinary test = new SearchBinary() ;
        System.out.println(test.binarySearch(9)) ;
        System.out.println(test.binarySearch(17)) ;

    }
}
