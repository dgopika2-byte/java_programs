import java.util.Scanner;
public class HollowRectangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of square:");
        int l=sc.nextInt();
        
        for(int i=1;i<=l;i++){
            for(int j=1;j<=l;j++){
                if(i==1||i==l||j==1||j==l){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
