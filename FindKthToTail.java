package niuke;


//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}


public class FindKthToTail {
    public ListNode findKthToTail(ListNode head,int k) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(count<k){
            return null;
        }else{
            ListNode slow = head;
            ListNode fast = head;
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }
            while(fast!=null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;

        }

    }
}
