package niuke;

/*
*
* */

public class MinNumberInRotateArray {

    public static int minNumberInRotateArray(int [] array) {
        if(array.length==1){
            return array[0];
        }
        int right = array.length-1;
        int left = 0;
        while(left<=right){
            int num = array[left];
            int mid = (right+left)/2;
            if(array[mid]>num){
                if(array[mid+1]<array[mid])
                    return array[mid+1];
                left = mid; // 不能写成mid+1
            }
            else{
                if(array[mid]<array[mid-1])
                    return array[mid];
                right = mid-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,2,3,4};
        System.out.println(minNumberInRotateArray(arr));
    }
}
