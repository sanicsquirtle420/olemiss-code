#include <stdio.h>
#include <sys/time.h>

int main(void) 
{
	// measuring time
	struct timeval begin, end ;
	gettimeofday(&begin , 0) ;

	int src[512][512] ;
	int dst [512][512] ;

	// version 2
	for(int j = 0 ; j < 512 ; j++) 
	{
		for(int i = 0 ; i < 512 ; i++) 
		{
			dst[j][i] = src[j][i] ;
		}
	}
	
	// ending time measuring
	gettimeofday(&end , 0) ;
	long sec = end.tv_sec - begin.tv_sec ;
	long microsec = end.tv_usec - begin.tv_usec ;
	double total = sec + microsec * 1e-6 ;

	printf("Time measured: %.3f seconds.\n" , total) ;

	return 0 ;
}
