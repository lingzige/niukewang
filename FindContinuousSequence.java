package niuke;

import java.util.ArrayList;

//小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
// 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
// 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
// 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!

public class FindContinuousSequence {

    public static void main(String[] args) {
        System.out.println(findContinuousSequence(9));
    }

    public static ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int num1 = 1;
        int num2 = 2;
        int res = num1+num2;
        int mid = sum/2;
        while(num1<=mid){
            if(res == sum){
                ArrayList<Integer> list1 = new ArrayList<>();
                for(int i=num1;i<=num2;i++){
                    list1.add(i);
                }
                list.add(list1);
                num2+=1;
                res += num2;
            }else if(res>sum){
                res -= num1;
                num1 += 1;
            }else{
                num2 += 1;
                res += num2;
            }

        }
        return list;
    }
}
