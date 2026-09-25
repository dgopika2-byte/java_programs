public class Anagram{
    public static void main(String args[]){
        String a="anagram";
        String b="nagaram";
        System.out.println("Is the given string is anagram: "+anagram(a,b));
    }
    static boolean anagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        int[] c=new int[250];
        for(int i=0;i<a.length();i++){
            c[a.charAt(i)]++;
            c[b.charAt(i)]--;
        }
        for(int count:c){
            if(count!=0){
                return false;
            }
        }
        return true;
    }

}