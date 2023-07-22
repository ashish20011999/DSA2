public class BFTTree {
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
        for (int i = 0; i < height; i++)
        {
            BFT(node,i);
            System.out.println(" ");
        }
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

    public static void BFT(Tree node, int height) {
        if(height<1)
        {
            return;
        }
        else if(height==1)
        {
            System.out.print(node.data+" ");
        }
        else{
            BFT(node.left,height-1);
            BFT(node.right,height-1);
        }
    }

}

