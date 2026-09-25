public class RefTrap {
    public static void main(String r[]){
        TCSBox b1=new TCSBox();
        TCSBox b3=new TCSBox();
        TCSBox b2=b1;
        b2.value=50;
        System.out.println(b1.value);
        System.out.println(b2.value);
        System.out.println(b3.value);
    }
}
class TCSBox{
    int value=10;
}
