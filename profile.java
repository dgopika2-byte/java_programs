import java.io.*;
public class profile
{
	public static void main(String[] args)throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		String a=br.readLine();
		System.out.println("entrt your age");
		int b=Integer.parseInt(br.readLine());
		System.out.println("entrt your salary");
		float c=Float.parseFloat(br.readLine());
		System.out.println("Iam "+a+" and Iam "+b+" years old, getting "+c+"Rs as salary");
	}
}