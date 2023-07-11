public class ReverseLLPair2 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4, null))));
        ListNode head = reverseInPair(node);
        while(head!=null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static ListNode reverseInPair(ListNode head)
    {
        if (head == null || head.next == null) {
            return head;
        }

        // Store the next node for recursion
        ListNode nextNode = head.next;

        // Swap the current node and the next node
        head.next = reverseInPair(nextNode.next);
        nextNode.next = head;

        // Return the new head (nextNode becomes the head after swapping)
        return nextNode;
    }
}
