package DSA;

public class HightOfBinaryyTree {
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;

        }
    }
    static int getHeight(TreeNode root){
        if(root==null){
            return -1;
        }
        else{
            return  Math.max(getHeight(root.left), getHeight(root.right))+1;
        }
    }
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5); 
        System.out.println("Height odf the tree is "+getHeight(root));
    }
}
