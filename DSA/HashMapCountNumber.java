//Count how many times each number appears.
package DSA;
import java.util.HashMap;
import  java.util.Scanner;
public class HashMapCountNumber {
    public static void main(String args[]){
        HashMap<Integer,Integer> hash=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int[] a= new int[n];
        //getting values in array
        System.out.println("Enter elements");        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //put number in hashmap and increase by 1 when again it appear
        for(int num:a){
            if(hash.containsKey(num)){
                hash.put(num,hash.get(num)+1);
            }
            else{
                hash.put(num,1);
            }
        }
        System.out.println(hash);
    }
}
