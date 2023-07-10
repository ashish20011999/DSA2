import java.util.function.LongUnaryOperator;

class HashSet {

    ListNode head;
    public HashSet() {
        this.head =  new ListNode();
        head.val = Integer.MIN_VALUE;
    }

    public void add(int key) {
        if(head.val==Integer.MIN_VALUE)
        {
            head.val = key;
        }
        else if (head.next == null)
        {
            head.next = new ListNode(key,null);
        }
        else {
            ListNode temp = head;
            while (temp.next != null) {
                if (temp.next.val == key && temp.next.next!=null) {
                    temp.next = temp.next.next;
                }
                else if(temp.next.val == key && temp.next.next==null)
                {
                    temp.next = null;
                    break;
                }
                temp = temp.next;
            }
            if(temp.next==null)
                temp.next = new ListNode(key, null);
        }
    }

    public void remove(int key) {
        if(head.val==key)
        {
            head = head.next;
        }
        ListNode temp =head;
        while(temp!=null)
        {
            if (temp.next!=null&&temp.next.val == key) {
                temp.next = temp.next.next;
            }
            temp =temp.next;
        }
    }

    public boolean contains(int key) {
        ListNode temp = head;
        while(temp!=null)
        {
            if (temp.val == key) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
public class myHashSet{
    public static void main(String[] args) {
        HashSet myHashSet = new HashSet();
        myHashSet.add(58);      // set = [1]
//        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(0)); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
    }
}