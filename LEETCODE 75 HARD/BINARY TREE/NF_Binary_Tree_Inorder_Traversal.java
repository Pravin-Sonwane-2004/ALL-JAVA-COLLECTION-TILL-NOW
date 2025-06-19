
public class  NF_Binary_Tree_Inorder_Traversal {
    public class tree {
        int val;
        tree left = null;
        tree right = null;
        public tree (int val) {
            this.right = null;
            this.left = null;
            this.val =val;
        }
    }
    public void inorder (tree root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        NF_Binary_Tree_Inorder_Traversal tree = new NF_Binary_Tree_Inorder_Traversal();
        
    }
}
