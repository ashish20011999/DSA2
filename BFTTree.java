import java.util.ArrayList;
import java.util.List;

public class BFTTree {
    List<Integer> nodeTraversal1 = new ArrayList<>();
    List<Integer> nodeTraversal2 = new ArrayList<>();
    public static void main(String[] args) {
        Tree node = new Tree(1,null,null);
        node.left = new Tree(2, null, null);
        node.right = new Tree(3, null, null);
        node.left.left = null;
        node.left.right = new Tree(5, null, null);
        node.left.right.left = new Tree(6, null, null);
        node.left.right.right = null;
        node.right.left = null;
        node.right.right = new Tree(7, null, null);
        node.right.right.left = new Tree(8, null, null);
        node.right.right.right = null;
        int height = treeHeight(node);
        for (int i = 1; i <= height; i++)
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
        else if(node==null)
        {
            return;
        }
        else if(height==1)
        {
            System.out.print(node.data+" ");
        }

        else{
            if (node.left != null || node.right != null) {
                BFT(node.left, height - 1);
                BFT(node.right, height - 1);
            }
        }
    }

}

