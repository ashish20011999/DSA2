public class ListNode {
    int val;
    ListNode next;
    ListNode(int val,ListNode next)
    {
     this.val = val;
     this.next = next;
    }
    ListNode(ListNode node)
    {
        this.val = node.val;
        this.next = node.next;
    }
    ListNode()
    {

    }
}
