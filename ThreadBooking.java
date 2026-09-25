public class ThreadBooking {
    public static void main(String []args){
        ticketBooking booking=new ticketBooking();
        customer c1=new customer(booking,"cus1",4);
        customer c2=new customer(booking,"cus2",5);
        customer c3=new customer(booking,"cus3",3);
        c1.start();
        c2.start();
        c3.start();
    }
}

class customer extends Thread{
    ticketBooking booking;
    String customerName;
    int tickets;
    customer(ticketBooking booking,String name,int ticket){
        this.booking=booking;
        this.customerName=name;
        this.tickets=ticket;
    }
    public void run(){
        booking.bookticket(customerName,tickets);
    }

    
}

class ticketBooking {
    int avail=10;
    synchronized void bookticket(String name,int tick){
        System.out.println(name+" want to book "+tick+" tickets");
        if(avail>=tick){
            System.out.println(name+" is booking...");
            try{
                Thread.sleep(2);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            avail=avail-tick;
            System.out.println(name+" successfully booked "+tick+" tickets");
            System.out.println("remaining "+avail);
        }
        else{
            System.out.println(name+"-not enough tickets");
            System.out.println("remaining "+avail);
        }
        System.out.println("--------------------------------");
    }

}