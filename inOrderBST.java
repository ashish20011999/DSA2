import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class inOrderBST {
    static List<Tree> nodeList = new ArrayList<>();
    public static void main(String[] args) {
        Tree root = new Tree(5,null,null);
        root.left = new Tree(1,null,null);
        root.right = new Tree(7,null,null);
        inOrderBSTTraversal(root);

        for(int i =0;i<nodeList.size()-1;i++)
        {
            nodeList.get(i).left =null;
            nodeList.get(i).right = nodeList.get(i+1);
        }
        nodeList.get(nodeList.size()-1).left =null;
        nodeList.get(nodeList.size()-1).right =null;

    }
    public static void inOrderBSTTraversal(Tree root) {
        if (root == null) {
            return;
        }
        inOrderBSTTraversal(root.left);
        nodeList.add(root);
        inOrderBSTTraversal(root.right);
    }
}
