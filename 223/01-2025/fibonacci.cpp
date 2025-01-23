#include <iostream>

using namespace std ;

int fibonacci(int n) ;

int main(void) {
    int fib_len ;
    cout << "How many numbers of the Fibonacci series: " ;
    cin >> fib_len ;

    int fib[fib_len] ;

    for(int i = 0 ; i < fib_len ; i++) {
        fib[i] = fibonacci(i) ;
        cout << fib[i] << " " ;
    }
    cout << endl ;

    return 0 ;
}

int fibonacci(int n) {
    if (n <= 1) {
        return n ;
    }

    return fibonacci(n - 1) + fibonacci(n - 2) ;
}
