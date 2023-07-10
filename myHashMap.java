import java.util.function.LongUnaryOperator;
class Pair{
    int key;
    int val;
    Pair(int key,int val)
    {
      this.key = key;
      this.val =val;
    }
    Pair()
    {
        
    }
}
class MapNode {
    Pair keyValue = new Pair();
    MapNode next;
    MapNode(int key,int val,MapNode next)
    {
        this.keyValue.key = key;
        this.keyValue.val = val;
        this.next=null;
    }
}
class HashMap {
    MapNode head;
    public HashMap() {
        this.head =  new MapNode(Integer.MIN_VALUE,Integer.MIN_VALUE,null);
    }

    public void put(int key, int val) {
        if(head.keyValue.key==Integer.MIN_VALUE || head.keyValue.key==key)
        {
            head.keyValue.key = key;
            head.keyValue.val = val;
        }
        else if (head.next == null)
        {
            head.next = new MapNode(key,val,null);
        }
        else {
            MapNode temp = head;
            while (temp.next != null) {
                if (temp.next.keyValue.key == key) {
                    temp.next.keyValue.val = val;
                    break;
                }
                temp = temp.next;
            }
            if(temp.next==null)
            {
                temp.next = new MapNode(key,val,null);
            }
        }
    }

    public void remove(int key) {
        if(head.keyValue.key==key)
        {
            head = head.next;
        }
        MapNode temp =head;
        while(temp!=null)
        {
            if (temp.next!=null&&temp.next.keyValue.key == key) {
                temp.next = temp.next.next;
            }
            temp =temp.next;
        }
    }

    public int get(int key) {
        MapNode temp = head;
        while(temp!=null)
        {
            if (temp.keyValue.key == key) {
                return temp.keyValue.val;
            }
            temp=temp.next;
        }
        return -1;
    }
}
public class myHashMap{
    public static void main(String[] args) {
        HashMap obj = new HashMap();
        obj.put(0,100);
        obj.put(1,101);
        obj.put(2,102);
        int key =1;
        int value = obj.get(key);
        System.out.println(value);
        obj.remove(key);
    }
}