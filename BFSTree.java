public class BFSTree {
    public static void main(String[] args) {
        Tree node = new Tree(1,null,null);
        node.left = new Tree(2, null, null);
        node.right = new Tree(3, null, null);
        node.left.left = new Tree(4, null, null);
        node.left.right = new Tree(5, null, null);
        node.left.right.right = new Tree(8, null, null);
        node.right.left = new Tree(6, null, null);
        node.right.right = new Tree(7, null, null);
        int height = treeHeight(node);
        System.out.println(height);
        int data = 1;
        BFS(node,data,1);
    }
    public static int treeHeight(Tree node)
    {
        if(node==null)
        {
            return 0;
        }
        int heightLeft = treeHeight(node.left)+1;
        int heightRight = treeHeight(node.right)+1;
        return Math.max(heightLeft,heightRight);
    }
    public static void BFS(Tree node, int data, int searchHeight)
    {
        if(node==null)
        {
            return;
        }
        else if(node.data==data)
        {
            System.out.println("found here at " + searchHeight + " level");
            return;
        }
        BFS(node.left,data,searchHeight+1);
        BFS(node.right,data,searchHeight+1);
    }
}
