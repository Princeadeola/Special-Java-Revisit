package Inheritance.Que1;

//This is the passenger details class that displays
//The travel route, Seat location and the e-ticket Number
public class PassengerDetails {
    public static void main(String[] args) {
        Smartwave smartwave = new Smartwave();

        System.out.println("Welcome back " + smartwave.name);

        System.out.println("Flight from " + smartwave.departure + " to " + smartwave.destination);
        System.out.println("seat number: Seat 30L");
        System.out.println("e-Ticket Number: 0223122332");
    }

}
