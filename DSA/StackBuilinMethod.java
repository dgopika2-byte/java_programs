package DSA;
import java.util.*;
public class StackBuilinMethod {
    public static void main(String args[]){
        Stack<Integer> s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        System.out.println("Last element "+s.pop()+" is removed");
        System.out.println("last element "+s.peek());
        System.out.println("Size is "+s.size());
        System.out.println("stack is empty: "+s.isEmpty());
        System.out.println(s);

    }
    
    

}
