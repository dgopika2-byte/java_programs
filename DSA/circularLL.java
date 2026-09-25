package DSA;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class circularLL {
    Node head=null;
    void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            newnode.next=head;
            return ;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next; 
        }
        temp.next=newnode;
        newnode.next=head;
    }
    void display(){
        Node temp=head;
        do{
            System.out.print(temp.data+" ---> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.print("null");
    }
    public static void main(String args[]){
        circularLL c=new circularLL();
        c.add(85);
        c.add(10);
        c.add(12);
        c.add(13);
        c.add(14);
        c.display();
    }
}
