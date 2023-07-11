public class LinkedListToBinary {
    public static void main(String[] args) {
        ListNode node = new ListNode(1,new ListNode(0, new ListNode(1,new ListNode(1, null)))); //1-0-1-1
        System.out.println(binaryConversion(node));
    }
    public static int binaryConversion(ListNode node)
    {
        ListNode temp = reverseLinkedList.reverseLL(node);
        int result = 0;
        int i =0;
        while(temp!=null)
        {
            result+=temp.val*Math.pow(2,i);
            i++;
            temp = temp.next;
        }
        return result;
    }
}
