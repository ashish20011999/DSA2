import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesLinkedList {
    public static void main(String[] args) {
        ListNode head =  new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(3,new ListNode(
                3,new ListNode(4,new ListNode(4,null)))))));
        ListNode result = removeDuplicateElements(head);
        while(result!=null)
        {
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static ListNode removeDuplicateElements(ListNode head) {
        ListNode temp = head;
        while(temp!=null && temp.next != null)
        {
            if(temp.val == temp.next.val)
            {
               temp.next = temp.next.next;
            }
            temp =temp.next;
        }
        return head;
    }
}
