public class shadowing {
    public static void main(String a[]){
        subc obj=new subc();
        System.out.print(obj.data);
    }
}
class superc{
    int data=10;
}
class subc extends superc{
    int data=50; 
}