import java.util.List;

public class ReverseLLPair {
    public static void main(String[] args) {
        ListNode node = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4, null))));
        ListNode first = node.next;
        ListNode head = reverseInPair(node);
        first.next = head;
        while(first!=null)
        {
            System.out.println(first.val);
            first = first.next;
        }
    }
    public static ListNode reverseInPair(ListNode head)
    {
        ListNode temp = new ListNode(head.next.val,head.next);
        ListNode lastNode = new ListNode(-1,null);
        int i = 0;
        while(temp!=null)
        {
            ListNode curr = temp;
            ListNode next = temp.next;
            curr.next = next.next;
            lastNode.next = next;
            next.next = curr;
            temp = next.next.next;
            lastNode = curr;
        }
        return head;
    }
}
