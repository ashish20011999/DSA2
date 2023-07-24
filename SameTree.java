public class SameTree {
    public static void main(String[] args) {
        Tree p = new Tree(); //define the tree, not defined here
        Tree q = new Tree(); //define the tree here too
        System.out.println(isSameTree(p,q));
    }
    public static boolean isSameTree(Tree p, Tree q) {
        if(p==null && q==null)
        {
            return true;
        }
        else if((p!=null && q==null)||(q!=null&& p==null)||p.data!=q.data)
        {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
