package niuke;
// 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
// 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindPath {
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        Stack<Integer> list = new Stack<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        return cal(root, target, list, res);
    }

    public ArrayList<ArrayList<Integer>> cal(TreeNode root, int target, Stack<Integer> list, ArrayList<ArrayList<Integer>> res){
        if(root!=null){
            if(root.left == null && root.right == null){
                ArrayList<Integer> list1 = new ArrayList<>();
                for (Integer integer : list) {
                    list1.add(integer);
                }
                if(root.val == target){
                    list1.add(root.val);
                    res.add(list1);
                }
                else{
                    return res;
                }
            }else {
                list.add(root.val);
                cal(root.left, target-root.val, list, res);
                cal(root.right, target-root.val, list, res);
                list.pop();
            }

        }
        return res;
    }
}
