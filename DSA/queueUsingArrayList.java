package DSA;
import java.util.*;
public class queueUsingArrayList {
    static ArrayList<Integer> queue=new ArrayList();
    static void enqueue(int data){
        queue.add(data);
        System.out.println(data+" added in queue");
    }
    static void dequeue(){
        if(queue.isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            int value=queue.remove(0);
            System.out.println(value+" is removed");
        }
    }
    static void display(){
        if(queue.isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("queue: "+queue);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of elemnts");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            enqueue(data);
        }
        display();
        dequeue();
        display();
        sc.close();
    }
}
