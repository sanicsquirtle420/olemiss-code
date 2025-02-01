#include <iostream>
#include <sys/time.h>

using namespace std ;

int main(void) {
	// measuring time
	struct timeval beg , end ;
	gettimeofday(&beg , 0) ;


  // TODO: allocate memory for these large arrays
	int src[2048][2048] ; 
	int dst[2048][2048] ;

	// version 1
	for(int i = 0 ; i < 2048 ; i++) {
		for(int j = 0 ; j < 2048 ; j++) {
			dst[j][i] = src[j][i] ;
		}
	}

	gettimeofday(&end , 0) ;
	long sec = end.tv_sec - beg.tv_sec ;
	long microsec = end.tv_usec - beg.tv_usec ;
	double total = sec + microsec * 1e-6 ;

	cout << "Time measured " << total << endl ;

	return 0 ;
}
