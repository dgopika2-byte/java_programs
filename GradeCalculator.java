import java.util.Scanner;
public class GradeCalculator {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 subject mark:- ");
        int sum=0;
        
        int s[]=new int[5];
        for(int i=0;i<5;i++){
            s[i]=sc.nextInt();
        }
        for(int j=0;j<5;j++){
            if(s[j]<35){
                System.out.println("fail");
                return;
            }
            else{
                sum+=s[j];
            }
        }
        int avg=sum/5;
        if(avg<35){
            System.out.println("fail");
        }
        else if(avg<=35 && avg<50){
            System.out.println("grade C");
        }
        else if(avg<=50 && avg<75){
            System.out.println("grade B");
        }
        else if(avg<=75 && avg<90){
            System.out.println("grade A");
        }
        else{
            System.out.println("grade O");
        }
        sc.close();
    }
    
}
