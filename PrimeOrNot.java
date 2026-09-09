import java.util.Scanner;
public class PrimeOrNot
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   	System.out.println("Enter a number");
	   	int a=sc.nextInt();
	   	int b=1;
	   	for(int i =2;i<a;i++){
	   	    if(a%i==0 && a!=i){
	   	        b=0;
	   	    }
	   	}
	   	
	   	if(b==1){
	        System.out.println("prime");   
	   	}
	   	else{
	        System.out.println("not prime");
	   	   }
		sc.close();
	}
}
