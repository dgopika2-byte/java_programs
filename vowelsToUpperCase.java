import java.io.*;
public class vowelsToUpperCase
{
	public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	String s=br.readLine();
    String n="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            n=n+Character.toUpperCase(s.charAt(i));
        }
        else{
            n=n+s.charAt(i);
        }
    }
	System.out.print(n);
	}
}