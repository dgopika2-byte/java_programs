
public class BankAccount{
    public static void main(String arg[]){
        Bank b=new Bank();
        b.setDeposte(10000);
        b.getWithdraw(600);
        b.getBalance();

    }
}
class Bank{
    private int balance;
    public void setDeposte(int amount){
        
        if(amount>0){
            System.out.println("you are depositing "+amount);
            balance=balance+amount;
        }
        System.out.println("remaining: "+balance);
    }
    public void getWithdraw(int amount){
        if(amount>0 && amount<=balance){
            System.out.println("you are withdrawing "+amount);
            balance=balance-amount;
            System.out.println("remaining: "+balance);
        }
    }
    public void getBalance(){
        System.out.print(balance);
    }

}