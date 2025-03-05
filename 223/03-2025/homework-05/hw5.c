#include <stdio.h>

void swap1(int i , int j) ;
void swap2(int* i , int* j) ;

int main(void)
{
    int x = 4 , y = 28 ;
    printf("SWAP1\nBEFORE: x: %d , y: %d\n" , x , y) ;
    swap1(x , y) ;
    printf("AFTER: x: %d , y: %d\n" , x , y) ;

    int* a = &x ;
    int* b = &y ;

    printf("\nSWAP2\nBEFORE: a: %d , b: %d\n" , *a , *b) ;
    // have to derefernce the pointer variable to 
    // get the decimal value
    swap2(a , b) ;
    printf("AFTER: a: %d , b: %d\n" , *a , *b) ;

    return 0 ;
}

void swap1(int i , int j) 
{
    int t = i ;
    i = j ;
    j = t ;
}

void swap2(int* i , int* j)
{
    int t = *i ;
    *i = *j ;
    *j = t ;
}
