package niuke;


// 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
// 如果有多对数字的和等于S，输出两个数的乘积最小的

import java.util.ArrayList;

public class FindNumbersWithSum {

    public ArrayList<Integer> findNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> list = new ArrayList<>();
        int low = 0;
        int high = array.length-1;
        while(low<high){
            int num = array[low] + array[high];
            if(num == sum){
                list.add(array[low]);
                list.add(array[high]);
                break;
            }else if(num < sum){
                low += 1;
            }else if(num > sum){
                high -= 1;
            }else
                return null;
        }
        return list;
    }

}
