import org.w3c.dom.ls.LSOutput;

public class PalindromeLL {
    public static void main(String[] args) {
        ListNode head =  new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(
                4,new ListNode(3,new ListNode(2,new ListNode(1,null)))))));
        System.out.println(LLPalindrome(head));
    }
    public static boolean LLPalindrome(ListNode head)
    {
        ListNode middle =middleNode(head);
        ListNode result = reverseLL(middle);
        while(head!=null)
        {
            if(result.val!=head.val)
                return false;
            head=head.next;
            result=result.next;
        }
        return true;
    }
    public static ListNode middleNode(ListNode head)
    {
        ListNode slow=head;
        ListNode fast= head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
