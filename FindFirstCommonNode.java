package niuke;


// 输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，
// 保证传入数据是正确的）
public class FindFirstCommonNode {

    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2==null)
            return null;
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
        int n1 = 0;
        int n2 = 0;

        while(head1!=null){
            n1++;
            head1 = head1.next;
        }

        while(head2!=null){
            n2++;
            head2 = head2.next;
        }

        // 长的链表先走abs(n1-n2)步
        head1 = pHead1;
        head2 = pHead2;

        if(n1>n2){
            for(int i=0;i<n1-n2;i++){
                head1 = head1.next;
            }
            while (head1 != null){
                if(head1 == head2){
                    return head1;
                }else {
                    head1 = head1.next;
                    head2 = head2.next;
                }
            }
        }else if(n1<n2){
            for(int i=0;i<n2-n1;i++){
                head2 = head2.next;
            }
            while (head2 != null){
                if(head1==head2){
                    return head2;
                }else {
                    head1 = head1.next;
                    head2 = head2.next;
                }
            }
        }else {
            while (head1 != null && head2 != null){
                if(head1==head2){
                    return head2;
                }else {
                    head1 = head1.next;
                    head2 = head2.next;
                }
            }
        }
        return null;
    }
}
