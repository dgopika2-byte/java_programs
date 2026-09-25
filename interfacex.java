public class interfacex {
    public static void main(String arg[]){
        payment p;
        p=new googlepay();
        p.pay();

    }
}
interface payment{
    void pay();
}
class googlepay implements payment{
    public void pay(){
        System.out.println("googlepay method");

    }
}
class creditcard implements payment{
    public void pay(){
        System.out.println("creditcard method");

    }
}
