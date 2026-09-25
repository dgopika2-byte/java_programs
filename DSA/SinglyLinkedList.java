package DSA;
class node{
    int data;
    node next;
    node(int data){
        this.next=null;
        this.data=data;
    }
}
public class SinglyLinkedList {
    node head;
    void add(int data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ---> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String args[]){
        SinglyLinkedList s=new SinglyLinkedList();
        s.add(10);
        s.add(12);
        s.add(13);
        s.add(14);
        s.display();
    }
}
