import java.io.*;
public class ContainZeroOrNot
{
	public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	String s=br.readLine();
	boolean t=false;
	for(int i=0;i<s.length();i++){
	    if(s.charAt(i)=='0'){
	        System.out.print("0 found");
	        t=true;
	        return;
	    }
	}
	if(t==false){
	    System.out.print("not found");
	}
	}
}