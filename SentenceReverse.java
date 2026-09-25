import java.util.StringTokenizer;


public class SentenceReverse{
    public static  void main(String ags[]){
        String s="iam a good girl";
        StringTokenizer st=new StringTokenizer(s);
        StringBuilder result=new StringBuilder();
        while(st.hasMoreTokens()){
            String word=st.nextToken();
        
        StringBuilder temp=new StringBuilder(word);
        temp.reverse();
        result.append(temp);
        if(st.hasMoreTokens()){
            result.append(" ");
        }
        }
        System.out.print(result);

    }
}