package DSA;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class stackUsingLinkedList {
    node top;
    void push(int data){
        node newnode=new node(data);
        newnode.next=top;
        top=newnode;
        System.out.println("Element "+data+" is added in stack");
        System.out.println("-----------------");
    }
    void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("last elemnt is removed");
            top=top.next;
        }
    }
    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("last elemnt is "+top.data);
            top=top.next;
        }
    }
void display(){
    if(top==null){
        System.out.println("Stack is empty");
    }
    else{
        node temp=top;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
void size(){
    int count=0;
    node temp=top;

    while(temp!=null){
        count++;
        temp=temp.next;
    }

    System.out.println("Size is "+count);
}
    void isEmpty(){
        if(top==null){
            System.out.println("stack is empty");
        }else{
            System.out.println("stack is not empty");            
        }   
    }
    public static void main(String args[]){
        stackUsingLinkedList stack=new stackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.peek();
        stack.display();
        stack.size();
        stack.isEmpty();
    }
}
