import java.io.*;
public class vowels
{
	public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	String s=br.readLine();
    char []c=s.toLowerCase().toCharArray();
    for(int i=0;i<c.length;i++){
        if(c[i]=='a'||c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
            System.out.println(c[i]);
        }
    }
	
	}
}