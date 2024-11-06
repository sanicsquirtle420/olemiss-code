
public class Sorts {
	private int[] array = new int[0];

	public void quickSort(int min, int max){
		int pivot;
		if(min < max){
			pivot = partition(min, max);
			quickSort(min, (pivot-1));
			quickSort((pivot + 1), max);
		}
	}
	
	public int partition(int min, int max){
		int pivot = array[min];
		int left = min;
		int right = max;
		while(left < right){
			while(array[left] <= pivot && left < right){
				left++;
			}
			while(array[right] > pivot){
				right--;
			}
			if(left < right){
				swap(left, right);
			}
		}
		swap(min, right);
		
		return right;
	}
	
	public void swap(int left, int right){
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
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
