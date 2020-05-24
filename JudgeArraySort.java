package niuke;

import java.util.Arrays;

public class JudgeArraySort {
    public static void reOrderArray(int [] array) {
        int length = array.length;
//        boolean flag = true;
        int count = 0;
//        for (int i = 0; i < length; i++) {
//            if(array[i]%2 != 0){
//                int j = i;
//                while(j>count){
//                    int temp = array[j];
//                    array[j] = array[j-1];
//                    array[j-1] = temp;
//                    j--;
//                }
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(array));


        int final_position = length-1;
        while(length > count){
            if(array[final_position]%2!=0){
                // 奇数移动到第一个元素的位置
                int temp = array[final_position];
                for(int i=final_position-1;i>=0;i--){
                    array[i+1] = array[i];
                }
                array[0] = temp;

            }else {
                final_position--;
            }
            count++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        reOrderArray(arr);
    }
}
