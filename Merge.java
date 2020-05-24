package niuke;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

public class Merge {
    public ListNode merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode temp1 = new ListNode(-1);
        ListNode temp = temp1;
        while(list1!=null && list2!=null){
            if(list1.val>=list2.val){
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }else{
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
        }
        if(list1!=null){
            temp.next = list1;
        }
        if(list2!=null){
            temp.next = list2;
        }
        return temp1.next;
    }
}
