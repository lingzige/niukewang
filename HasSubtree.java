package niuke;
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

class TreeNode1 {
    int val = 0;
    TreeNode1 left = null;
    TreeNode1 right = null;

    public TreeNode1(int val) {
        this.val = val;
    }

 }

public class HasSubtree {
    public boolean hasSubtree(TreeNode1 root1,TreeNode1 root2) {
        boolean res = false;
        if(root1==null || root2==null)
            return false;
        if(root1.val==root2.val){
            res = isSubTree(root1,root2);
        }
        if(!res){
            res = hasSubtree(root1.left,root2);
        }
        if(!res){
            res = hasSubtree(root1.right, root2);
        }

        return res;
    }

    public boolean isSubTree(TreeNode1 root1,TreeNode1 root2){
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }
}
