import java.util.*;
public class SeatArrangement {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int seat[][]=new int[3][2];
    for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            seat[i][j]=0;
        }
    }
    System.out.println("----BUS SEATING ARRANGEMENT----");
    for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            System.out.print("["+(i+1)+","+(j+1)+"]");
        }
        System.out.println();
    }
    System.out.println("Enter row (1-3)");
    int row=sc.nextInt();
    System.out.println("Enter seat(1-2)");
    int col=sc.nextInt();
    if(row<1 || row>3 || col<1 || col>2){
        System.out.println("Invalid seat number");
    }
    else if(seat[row-1][col-1]==1){
        System.out.println("Seat Already Booked");
    }
    else{
        seat[row-1][col-1]=1;
        System.out.println("Seat Booked Successfully");
    }
    System.out.println("-----FINAL SEAT ARRANGEMENT-----");
    System.out.println();
    for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            if(seat[i][j]==0){
                System.out.print(" [Available] ");
            }
            else{
                System.out.print(" [Booked] ");
            }
        }
        System.out.println();
    }
    sc.close();
    }
}
