package niuke;
// 重建二叉树
/*
* 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
* 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
* 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
* */


import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }


public class ReConstructBinaryTree {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if(pre.length == 0){
            return null;
        }

        if(pre.length == 1){
            return new TreeNode(pre[0]);
        }

        int rootVal = pre[0];
        int inVal=0;
        TreeNode root = new TreeNode(rootVal);
        for (int i = 0; i < in.length; i++) {
            if(in[i] == rootVal){
                inVal = i;
                break;
            }
        }
        int[] new_pre = new int[inVal];
        int[] new_in = new int[inVal];
        int[] new_pre_after = new int[pre.length-inVal-1];
        int[] new_in_after = new int[pre.length-inVal-1];
        for(int i=0;i<inVal;i++){
            new_pre[i] = pre[i+1];
        }
        for(int i=0;i<inVal;i++){
            new_in[i] = in[i];
        }
        for(int i=0;i<new_pre_after.length;i++){
            new_pre_after[i] = pre[inVal+1+i];
        }
        for(int i=0;i<new_in_after.length;i++){
            new_in_after[i] = in[inVal+1+i];
        }
        root.left = reConstructBinaryTree(new_pre, new_in);
        root.right = reConstructBinaryTree(new_pre_after, new_in_after);
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};
        TreeNode root = reConstructBinaryTree(pre, in);
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> link = new LinkedList<>();
//        if(root==null){
//            return new ArrayList<Integer>();
//        }
        link.addLast(root);
        while(link.size()>0){
            root = link.removeFirst();
            list.add(root.val);
            if(root.left != null){
                link.addLast(root.left);
            }
            if(root.right != null){
                link.addLast(root.right);
            }
        }
        System.out.println(list);
    }
}
