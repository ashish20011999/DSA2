public class reverseLinkedList {
    public static void main(String[] args) {
        ListNode head =  new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(
                5,new ListNode(6,new ListNode(7,null)))))));
        ListNode result = reverseLL(head);
        while(result!=null)
        {
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static ListNode reverseLL(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;
        while(curr!=null)
        {
            next =curr.next;
            curr.next = prev;
            prev=curr;
            curr =  next;
        }
        return prev;
    }
}
