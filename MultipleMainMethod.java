public class MultipleMainMethod{
    public static void main(String arg){
        System.out.println("overloaded entry"+arg);
        

    }
    public static void main(String[] args){
        System.out.println("standard execution entry");
        main("TCS");
    }
}