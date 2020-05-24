package niuke;

// 统计一个数字在排序数组中出现的次数。

public class GetNumberOfK {
    public int getNumberOfK(int [] array , int k) {

        int count = 0;
        int high = array.length;
        int low = 0;
        while(low<high){
            int mid = (low+high)/2;
            if(array[mid]==k){
                count++;
                for(int i=0;i<mid;i++){
                    if(array[i]==k)
                        count++;
                }
                for(int i=mid+1;i<array.length;i++){
                    if(array[i]==k)
                        count++;
                }
                return count;
            }else if(array[mid]>k){
                high = mid;
            }else{
                low = mid+1;
            }

        }
        return 0;
    }
}
