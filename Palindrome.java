import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        System.out.print("Enter a string: ");
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.print("yes");
            
        }
        else{
            System.out.print("no");
        }
        
        sc.close();
    }
}