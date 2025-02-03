#include <iostream>
#include <sys/time.h>

using namespace std ;

int main(void) {
	// measuring time
	struct timeval beg , end ;
	gettimeofday(&beg , 0) ;

    // allocating space for larger arrays
    int** src = new int* [2048] ;
    int** dst = new int* [2048] ;

    for(int i = 0 ; i < 2048 ; i++) {
        src[i] = new int[2048] ;
        dst[i] = new int[2048] ;
    }

	// version 2
	for(int j = 0 ; j < 2048 ; j++) {
		for(int i = 0 ; i < 2048 ; i++) {
			dst[j][i] = src[j][i] ;
		}
	}

	gettimeofday(&end , 0) ;
	long sec = end.tv_sec - beg.tv_sec ;
	long microsec = end.tv_usec - beg.tv_usec ;
	double total = sec + microsec * 1e-6 ;

    // deallocating memory
    for(int i = 0 ; i < 2048 ; i++) {
        delete[] src[i] ;
        delete[] dst[i] ;
    }

    delete[] src ;
    delete[] dst ;

	cout << "Bonus: Version 2" << endl ;
	cout << "Time measured " << total << endl ;

	return 0 ;
}
