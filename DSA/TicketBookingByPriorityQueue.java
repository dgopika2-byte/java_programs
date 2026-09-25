package DSA;
import java.util.*;
class passenger implements Comparable<passenger>{
    String name;
    int priority;
    passenger(String name,int pri){
        this.name=name;
        this.priority=pri;
    }
    @Override 
    public int compareTo(passenger other){
        return this.priority-other.priority;
    }
}
public class TicketBookingByPriorityQueue{
    public static void main(String args[]){
        PriorityQueue<passenger> queue=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of passengers");
        int n=sc.nextInt();
        //sc.next();
        for(int i=0;i<n;i++){
            System.out.println("Enter name of passenger "+(i+1));
            String name=sc.next();
            System.out.println("\n 1-emergency \n 2-seniour citizen \n 3-business class \n 4-Normal passenger");
            int priority=sc.nextInt();
            //sc.next();
            queue.add(new passenger(name, priority));
        }
        while(!queue.isEmpty()){
            passenger p=queue.poll();
            System.out.println("passenger "+p.name+" with priority "+p.priority);
        }
        sc.close();
    }

}