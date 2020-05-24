package niuke;

// 从尾到头打印一个链表
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        /*
        正确方法：
        * Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.empty()){
            list.add(stack.pop());
        }
        return list;
        * */


        ArrayList<Integer> list = new ArrayList<>();
        if(listNode == null)
            return list;
        if(listNode.next == null){
            list.add(listNode.val);
            return list;
        }
        ListNode head = listNode;
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = list.size();

        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        reverse(arr, i, j-1);
        ArrayList<Integer> list1 = (ArrayList<Integer>)Arrays.asList(arr);
        return list1;

    }

    public void reverse(Integer[] list, int i, int j){
        while(i<j){
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            i++;
            j--;
        }
    }

//    public ListNode ReverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode next = null;
//        while(head != null){
//            next = head.next;
//            head.next = pre;
//            pre = head;
//            head = next;
//        }
//        return head;
//    }
}
