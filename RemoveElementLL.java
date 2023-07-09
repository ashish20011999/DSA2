
public class RemoveElementLL {
    public static void main(String[] args) {
        ListNode head =  new ListNode(1,new ListNode(2,new ListNode(6,new ListNode(3,new ListNode(
                4,new ListNode(5,new ListNode(6,null)))))));
        ListNode result = removeElements(head ,6);
        while(result!=null)
        {
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static  ListNode removeElements(ListNode head, int val) {
        while(head.val==val)
        {
            head=head.next;
        }
        ListNode result = head;
        while(head!=null)
        {
            if(head.next.val==val)
            {
                ListNode next_nonVal = head.next;
                while(next_nonVal!=null && next_nonVal.val==val)
                {
                    next_nonVal=next_nonVal.next;
                }
                if(next_nonVal!=null)
                    head.next = next_nonVal;
                else
                    head.next = null;

            }
            head = head.next;
        }
        return result;
    }
}
