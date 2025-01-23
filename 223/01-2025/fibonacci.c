#include <stdio.h>

int fibonacci(int n) ;

int main(void)
{
    int fib_len ;

    printf("How many numbers of the Fibonacci series: ") ;
    scanf("%d" , &fib_len) ;

    int fib[fib_len] ;

    for(int i = 0 ; i < fib_len ; i++)
    {
        fib[i] = fibonacci(i) ;
        printf("%d " , fib[i]) ;
    }
    printf("\n") ;

    return 0 ;
}

// calculating the fibonacci series with recursion
int fibonacci(int n) 
{
    if(n <= 1)
    {
        return n ;
    }

    return fibonacci(n - 1) + fibonacci(n - 2) ;
}
