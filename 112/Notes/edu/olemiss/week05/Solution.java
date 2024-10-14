package edu.olemiss.week05 ;

public class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder(Integer.toString(x))  ;
        StringBuilder compare = new StringBuilder(Integer.toString(x))  ;

        str.reverse() ;

        if(str != (compare)) {
            System.out.printf("%s , %s\n" , str , compare) ;
            return false ;
        }
        else {
            System.out.printf("%s , %s\n" , str , compare) ;
            return true ;
        }
    }

    public static void main(String[] args) {
        Solution test = new Solution() ;
        int a = 121 , b = -121 , c = 10 ;

        System.out.println("Test 1: " + test.isPalindrome(a)) ;
        System.out.println("Test 2: " + test.isPalindrome(b)) ;
        System.out.println("Test 3: " + test.isPalindrome(c)) ;
    }
}
