package edu.olemiss.week11 ;

public class quickSort {
    private int[] array = new int[20] ;

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
}
