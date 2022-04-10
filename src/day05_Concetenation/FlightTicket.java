package day05_Concetenation;

public class FlightTicket {
    public static void main(String[] args) {
        String from= "Las Vegas",
                to= "McLean";
        double price= 425.5;

        String fullTicketInfo = "From "+ from+ " to "+ to+ " is $"+price;

        System.out.println(fullTicketInfo);
    }
}
