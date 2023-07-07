public class Tree {
    int data;
    Tree left;
    Tree right;

    Tree(){}
    Tree(int val)
    {
        this.data =val;
    }

    Tree(int data, Tree left, Tree right)
    {
        this.data =data;
        this.left = null;
        this.right =null;
    }
}
