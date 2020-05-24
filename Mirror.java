package niuke;

public class Mirror {
    public void mirror(TreeNode1 root) {
        if(root==null)
            return;
        mirror(root.left);
        mirror(root.right);

        TreeNode1 temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
