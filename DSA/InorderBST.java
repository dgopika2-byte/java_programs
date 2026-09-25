package DSA;

class node{
    int data;
    node left,right;
    node(int val){
        this.data=val;
        left=null;
        right=null;
    }
}
public class InorderBST {
    static node insert(node root,int val){
        if(root==null){
            return new node(val);
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    static  boolean search(node root,int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(val<root.data){
            return search(root.left, val);
        }
        else{
            return search(root.right,val);
        }
    }
    static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[]){
        node root=null;
        root=insert(root, 40);
        root=insert(root, 20);
        root=insert(root, 80);
        root=insert(root, 90);
        root=insert(root, 60);
        System.out.println("Inorder");
        inorder(root);
        int value=60;
        if(search(root,value)){
            System.out.println(value+" found");
        }
        else{
            System.out.println(value+" is not found");
        }

    }
}
