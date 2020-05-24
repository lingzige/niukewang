package niuke;

public class IsSymmetrical {
    public boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)
            return true;
        return judge(pRoot.left, pRoot.right);
    }

    public boolean judge(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left != null && right != null)
            return left.val == right.val && judge(left.left, right.right) && judge(left.right, right.left);
        return false;
    }
}
