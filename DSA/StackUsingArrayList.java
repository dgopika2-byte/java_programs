package DSA;
import java.util.*;
public class StackUsingArrayList {
    
    ArrayList<Integer> arr=new ArrayList<>();
    void push(int data){
        arr.add(data);
        System.out.println("Element "+data+" is added in stack");
        System.out.println("stack: "+arr);
        System.out.println("-----------------");
    }
    void pop(){
        arr.remove(arr.size()-1);
        System.out.println("last Element removed in stack");
        System.out.println("stack: "+arr);
        System.out.println("-----------------");
    }
    void size(){
        System.out.println("Stsck size is "+arr.size());
        System.out.println("-----------------");
    }
    void isEmpty(){
        if(arr.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
        System.out.println("-----------------");
    }
    void peek(){

        System.out.println("last Element: "+arr.get(arr.size()-1));
        System.out.println("-----------------");
    }
    public static void main(String []args){
        //Scanner sc=new Scanner(System.in);
        StackUsingArrayList stack=new StackUsingArrayList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.size();
        stack.isEmpty();

        


    }
}
