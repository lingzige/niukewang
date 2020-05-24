package niuke;


// 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
// 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null)
            return pHead;

        ListNode temp = new ListNode(0);
        ListNode temp_next = temp;
        while(temp != null && temp.next != null){
            if(pHead.val != pHead.next.val){
                temp_next.next = pHead;
                temp_next = pHead;
                pHead = pHead.next;
//                temp.next = temp_next;
//                temp = temp.next;
            }else {
                int val = pHead.val;
                while (val == pHead.val && pHead!=null){
                    pHead = pHead.next;
                }
                temp_next.next = pHead;
//                temp.next = temp_next;
//                temp = temp.next;

            }

        }
        return temp.next;
    }
}
