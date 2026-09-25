package DSA;
import java.util.*;
public class heightOfTreeUserInput {
    static class node{
        int data;
        node left,right;
        node(int data){
            this.data=data;
        }
    }
    static int getHeight(node root){
        if(root==null){
            return -1;
        }
        else{
            return Math.max(getHeight(root.left), getHeight(root.right))+1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Queue<node> q=new LinkedList<>();
        System.out.println("enter number of node");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if (n == 0 || a[0] == -1) {
            System.out.println(0);
            return;
        }
        node root=new node(a[0]);
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<n){
            node current=q.poll();
            if(i<n && a[i]!=-1){
                current.left=new node(a[i]);
                q.add(current.left);
            }
            i++;
            if(i<n && a[i]!=-1){
                current.right=new node(a[i]);
                q.add(current.right);
            }
            i++;
        }
        System.out.println("Height is "+getHeight(root));
    }
}
