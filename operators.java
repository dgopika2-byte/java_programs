import java.io.*;
public class operators
{
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter val 1");
		float a=Float.parseFloat(br.readLine());
		System.out.println("enter val 2");
		float b=Float.parseFloat(br.readLine());
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println( a/b);
		System.out.println(a%b);
	}
}