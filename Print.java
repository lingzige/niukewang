package niuke;

import java.util.ArrayList;
import java.util.Collections;

public class Print {

    public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        if(pRoot == null)
            return null;
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<TreeNode> list1 = new ArrayList<>();
        list1.add(pRoot);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(pRoot.val);
        lists.add(list2);
        while (list1 != null){
            TreeNode cur = list1.remove(0);
            ArrayList<Integer> list = new ArrayList<>();
            if(cur.left != null){
                list1.add(cur.left);
                list.add(cur.left.val);
            }
            if(cur.right != null){
                list1.add(cur.right);
                list.add(cur.right.val);
            }
            lists.add(list);
        }
        for(int i=0;i<lists.size();i++){
            if(i%2!=0){
                Collections.reverse(lists.get(i));
            }
        }

        return lists;
    }


}
