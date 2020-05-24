package niuke;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8,12,11,9,0};
        quickSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low>=high)
            return;
        int res = partition(arr, low, high);

        quickSort(arr, low, res-1);
        quickSort(arr, res+1,high);

    }

    public static int partition(int[] arr, int low, int high){
        int v = arr[low];
        int start = low;
        int end = high;
        while(start<end){
            while(start<end && arr[end]>v){
                end--;
            }
            while(start<end && arr[start]<=v){
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        arr[low] = arr[end];
        arr[end] = v;
        return end;

    }
}
