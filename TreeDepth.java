package niuke;

//输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
// 最长路径的长度为树的深度。

import java.util.LinkedList;

class TreeNode2 {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode2(int val) {
        this.val = val;

    }

}

public class TreeDepth {

    public int treeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int depth = 0;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.addLast(root);
        while(list.size() != 0){
            int len_list = list.size();
            while(len_list>0){
                TreeNode cur = list.removeFirst();
                len_list -= 1;
                if(cur.left != null)
                    list.addLast(cur.left);
                if(cur.right != null)
                    list.addLast(cur.right);
            }
            depth++;
        }

        return depth;
    }
}
