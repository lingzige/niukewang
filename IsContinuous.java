package niuke;

// ,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
// 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
// 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，
// 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。

import java.util.Arrays;

public class IsContinuous {

    public static void main(String[] args) {
        int[] num = {0,0,3,5,7};
        System.out.println(isContinuous(num));
    }

    public static boolean isContinuous(int [] numbers) {
        if(numbers.length<5){
            return false;
        }
        // 1. 对numbers进行排序
        Arrays.sort(numbers);
        int num_zero = 0;
        int num_gap = 0;
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i] == 0){
                num_zero++;
            }
        }
        if(num_zero>2)
            return false;
        for (int i = num_zero; i < numbers.length-1; i++) {
            if(numbers[i+1]==numbers[i])
                return false;
            if(numbers[i+1]==numbers[i]+1){
                continue;
            }else{
                num_gap += (numbers[i+1]-numbers[i]-1);
            }
        }
        if(num_zero>=num_gap){
            return true;
        }else
            return false;
    }
}
