package edu.olemiss.week11 ;

public class mergeSort {
	private int[] array = new int[20];
	
	public void mergeSort(int min, int max){
		if(min < max){
			int mid = (min + max)/2;
			mergeSort(min, mid);
			mergeSort(mid+1, max);
			merge(min, mid, max);
		}
	}
	
	public void merge(int first, int mid, int last){
		int[] temp = new int[array.length];
		int first1 = first;
		int last1 = mid;
		int first2 = mid + 1;
		int last2 = last;
		int index = first1;
		
		while(first1 <= last1 && first2 <= last2){
			if(array[first1] < array[first2]){
				temp[index] = array[first1];
				first1++;
			}
			else {
				temp[index] = array[first2];
				first2++;
			}
			index++;
		}
		while(first1 <= last1){
			temp[index] = array[first1];
			first1++;
			index++;
		}
		while(first2 <= last2){
			temp[index] = array[first2];
			first2++;
			index++;
		}
		for(index = first; index <= last; index++){
			array[index] = temp[index];
		}
	}
}
