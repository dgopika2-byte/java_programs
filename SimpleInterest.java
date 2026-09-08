import java.io.*;
public class SimpleInterest
{
	public static void main(String[] args)throws IOException {
	int amount=2500;
	int rate=5;
	int time=2;
	int interest=(amount*rate*time)/100;
	System.out.println("Simple Interest: "+interest);
	}
}