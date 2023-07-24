public class MirrorTree {
    public static void main(String[] args) {
        Tree root = new Tree(); //define the tree, not defined here
        System.out.println(isSymmetric(root));
    }
    public static boolean isSymmetric(Tree root) {
        if(root == null)
        {
            return true;
        }
        else
        {
            return  mirror(root.left,root.right);
        }
    }
    public static boolean mirror(Tree p, Tree q)
    {
        if(p == null && q == null)
        {
            return true;
        }
        else if(p==null || q==null)
        {
            return false;
        }
        else
        {
            return p.data==q.data && mirror(p.left,q.right) && mirror(p.right,q.left);
        }
    }
}
