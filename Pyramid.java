import java.util.Scanner;
public class Pyramid
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   	System.out.println("Enter a number");
	   	int a=sc.nextInt();	  
	   	System.out.println("output");
	   	for(int i=1;i<=a;i++){
	   	    for(int j=1;j<=i;j++){
	   	        if(i%2!=0){
	   	            System.out.print("*");
	   	        }
	   	        else{
	   	            System.out.print(i);
	   	        }
	   	    }
	   	    System.out.println();
	   	}
        sc.close();
	}
}

