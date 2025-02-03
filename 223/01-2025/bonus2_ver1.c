#include <stdio.h>
#include <stdlib.h>
#include <sys/time.h>

int main(void) 
{
	// allocating space for larger arrays
	int **src = (int**) malloc(2048 * sizeof(int*)) ;
	int **dst = (int**) malloc(2048 * sizeof(int*)) ;

	for(int i = 0 ; i < 2048 ; i++) 
	{
		src[i] = (int*) malloc(2048 * sizeof(int)) ;
		dst[i] = (int*) malloc(2048 * sizeof(int)) ;
	}

	// measuring time
	struct timeval begin, end ;
	gettimeofday(&begin , 0) ;

	// version 1
	for(int i = 0 ; i < 2048 ; i++) 
	{
		for(int j = 0 ; j < 2048 ; j++) 
		{
			dst[j][i] = src[j][i] ;
		}
	}
	
	// ending time measuring
	gettimeofday(&end , 0) ;
	long sec = end.tv_sec - begin.tv_sec ;
	long microsec = end.tv_usec - begin.tv_usec ;
	double total = sec + microsec * 1e-6 ;

	// deallocating memory
	for(int i = 0 ; i < 2048 ; i++)
	{
		free(src[i]) ;
		free(dst[i]) ;
	}

	free(src) ;
	free(dst) ;

	printf("Bonus: Version 1\n") ;
	printf("Time measured: %.3f seconds.\n" , total) ;

	return 0 ;
}
