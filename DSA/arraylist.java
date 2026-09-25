package DSA;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> mark=new ArrayList<>();
        mark.add(30);
        mark.add(10);
        mark.add(60);
        mark.add(40);
        mark.add(1,80);
        System.out.println(mark);
        
        System.out.println(mark.get(4));
        mark.set(4,50);
        System.out.println(mark);
        mark.remove(3);
        System.out.println(mark);
        System.out.println(mark.size());
        System.out.println("contains 40?: "+mark.contains(40));
        System.out.println("index of 40?: "+mark.indexOf(40));
        System.out.println(mark);

    }
}
