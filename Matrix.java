import java.util.Scanner;
public class Matrix {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int row=3;
        int col=3;
        int m[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("original array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j%2==0){
                    System.out.print(m[i][j]+" ");
                }
                else{
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
