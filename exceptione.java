import java.util.*;
class InvalidUsername extends Exception{
    InvalidUsername(String msg){
        super(msg);
    }
}
class InvalidPassword extends Exception{
    InvalidPassword(String msg){
        super(msg);
    }
}

public class exceptione {
    static void login(String name,String pass)throws InvalidUsername,InvalidPassword{
        String correctname="admin";
        String correctpass="g123";
        if(!correctname.equals(name)){
            throw new InvalidUsername("Invalid username");
        }
        if(!correctpass.equals(pass)){
            throw new InvalidUsername("Invalid password");
        }
        System.out.println("login successfully");
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int attempt=2;
        while(attempt>0){
            try{
                System.out.println("Enter user name");
                String user=sc.nextLine();
                System.out.println("Enter password");
                String pass=sc.nextLine();
                login(user,pass);
                break;
            }
            catch(InvalidUsername e){
                attempt--;
                System.out.println(e.getMessage());
                if(attempt>0){
                    System.out.println(e.getMessage());
                }
                 System.out.println("attempt remaining is "+attempt);
            }
            catch(InvalidPassword e){
                attempt--;
                System.out.println(e.getMessage());
                if(attempt>0){
                    System.out.println(e.getMessage());
                }
                 System.out.println("attempt remaining is "+attempt);
            }
        }
        if(attempt==0){
            System.out.println("Account blocked");
        }
        sc.close();
        }


    }
    

