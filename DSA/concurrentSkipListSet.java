package DSA;
import java.util.concurrent.ConcurrentSkipListSet;
public class concurrentSkipListSet {
    public static void main(String args[]){
        ConcurrentSkipListSet<Integer> s=new ConcurrentSkipListSet();
        s.add(10);
        s.add(35);
        s.add(30);
        s.add(40);
        System.out.println(s);
        System.out.println("contains 40: "+s.contains(40));
        s.remove(40);
        System.out.println(s);
        System.out.println("1st element is "+s.first());
        System.out.println("last element is "+s.last());
        System.out.println("higher than 30 is "+s.higher(30));
        System.out.println("lower than 30 is "+s.lower(30));
        System.out.println("lower than or equal to 30 is "+s.floor(30));
        System.out.println("higher than or equal to 30 is "+s.ceiling(30));
    }
    
}
