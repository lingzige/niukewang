package niuke;

//输入一个非空整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
// 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

public class VerifySquenceOfBST {
    public static boolean verifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        return isTree(sequence, 0, sequence.length-1);
    }

    public static boolean isTree(int[] sequence, int start, int end){
        if(end<=start)
            return true;
        int i = start;
        for(;i<end;i++){
            if(sequence[i]>sequence[end]){
                break;
            }
        }
        for(int j=i;j<end;j++){
            if(sequence[j]<sequence[end]){
                return false;
            }
        }
        return isTree(sequence, start,i-1)&& isTree(sequence, i, end-1);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,6,8,7,5,1};
        System.out.println(verifySquenceOfBST(arr));
    }
}
