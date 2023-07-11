public class rotateLl {
    public static void main(String[] args) {
        ListNode  node = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4, null))));
        ListNode head = rotateLL(node,2);
        while(head!=null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static ListNode rotateLL(ListNode head,int k)
    {   if(head==null || head.next==null) return head;
        while(k>0)
        {   ListNode temp = new ListNode(head);
            while(temp.next != null && temp.next.next!=null)
            {
                temp = temp.next;
            }
            temp.next.next = head;
            head = temp.next;
            temp.next =null;
            k--;
        }
        return head;
    }
}
