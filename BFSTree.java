

public class BFSTree {
    public int height  =-1;
    public static void main(String[] args) {
        Tree node = new Tree(1,null,null);
        node.left = new Tree(2, null, null);
        node.right = new Tree(3, null, null);
        node.left.left = new Tree(4, null, null);
        node.left.right = new Tree(5, null, null);
        node.left.right.right = new Tree(8, null, null);
        node.right.left = new Tree(6, null, null);
        node.right.right = new Tree(7, null, null);

        int data = 2;
        new BFSTree().searchLevelOfElement(node,data);
    }
    public static void BFS(Tree node)
    {
        if(node == null)
        {
            return;
        }
        BFS(node.left);
        BFS(node.right);
        System.out.println(node.data);
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
    public int searchLevelOfElement(Tree root,int data)
    {
        // Base Case
        if (root == null)
        {
            return -1;
        }

        // Store the maximum height of
        // the left and right subtree
        int leftHeight = searchLevelOfElement(root.left, data);

        int rightHeight = searchLevelOfElement(root.right, data);

        // Update height of the current node
        int ans = Math.max(leftHeight, rightHeight) + 1;

        // If current node is the required node
        if (root.data == data) {
            height = ans;
            System.out.println(height);
        }

        return ans;
    }
}
