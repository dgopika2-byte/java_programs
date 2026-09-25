package DSA;
class node{
    int data;
    node next;
    node prev;
    node(int data){
        this.next=null;
        this.data=data;
        this.prev=null;
    }
}
public class DoublyLinkedList {
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
        newNode.prev=temp;
    }
    void displayForward(){
        node temp=head;
        System.out.println("Elements in forward");
        while(temp!=null){

            System.out.print(temp.data+" ---> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    void displayBackward(){
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println("Elements in backward");
        while(temp!=null){  
            System.out.print(temp.data+" ---> ");
            temp=temp.prev;
        }
         System.out.print("null");
    }
    public static void main(String args[]){
        DoublyLinkedList d=new DoublyLinkedList();
        d.add(10);
        d.add(12);
        d.add(13);
        d.add(14);
        d.displayForward();
        d.displayBackward();

    }
}
