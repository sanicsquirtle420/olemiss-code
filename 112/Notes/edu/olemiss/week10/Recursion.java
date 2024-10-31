package edu.olemiss.week10 ;

import java.util.Scanner ;

public class Recursion {
    public static void main(String[] args) {
        int n ;

        Scanner scan = new Scanner(System.in) ;
        System.out.print("How many numbers of the fibonacci sequence do you want? ") ;
        n = scan.nextInt() ;

        for(int i = 0 ; i < n ; i++) {
            if((i + 1) % 10 != 0) {
                System.out.printf("%d ", fib(i));
            } else {
                System.out.printf("%d \n" , fib(i)) ;
            } // just formating it to split after every 10
        }
        System.out.println() ;
    }

    static int fib(int n) {
        // 1. Recursion control variable: n
        if (n <= 1) {
            // 2. Base case
            return n ;
        }

        return fib(n - 1) + fib(n - 2) ;
        // 3. Recursive call updating the control variable
    }
}
