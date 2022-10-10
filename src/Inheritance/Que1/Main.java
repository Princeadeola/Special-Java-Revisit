package Inheritance.Que1;

import java.util.Scanner;

public class Main {
    //This class is the main class in which the whole process is
    //carried out

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //let receive the use booking options
        System.out.println("Welcome to the SMARTWAVE airline");
        System.out.println("Thank you for choosing us and trusting our service");
        System.out.println();

        System.out.println("We have the following available classes");
        System.out.println("1. Cloud Nine Waves");
        System.out.println("2. Business class Waves");
        System.out.println("3. Economic  class Waves");

        System.out.println("Enter 1/2/3 or use 0 to exit: ");
        int option = input.nextInt();
        switch (option){
            case 1:
                cloudNine();
                break;
            case 2:
                businessClass();
                break;
            case 3:
                economicClass();
                break;
            case 0:
                System.out.println("Thank you for checking us, we believe we have all you, fly with us today!!!");
                System.exit(0);
            default:
                System.out.println("Please select 1/2/3 or use 0 to exit");
        }
    }

    private static void economicClass() {
        System.out.println("Welcome to our economic booking page, we still give you the best feel that you need");

        getUserDetails();
    }

    private static void businessClass() {
        System.out.println("Welcome to our Business class booking page, All the comfort you need to make a success deal");

        getUserDetails();
    }

    private static void cloudNine() {
        System.out.println("Welcome to our cloud Nine booking page,The feel of the president (VIPs)");

        getUserDetails();
    }

    public static void getUserDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Let fill in your details(Ensure your details are same with what is on your passport)");

        System.out.println("Your full name: ");
        String name = input.nextLine();

        System.out.println("Your passport number: ");
        String passportNumber = input.nextLine();

        System.out.println("Departure (e.g Lagos): ");
        String departure = input.nextLine();

        System.out.println("Destination (e.g London): ");
        String destination = input.nextLine();

        System.out.println("Thank you for providing your details, we are now booking flight for");
        System.out.println(name + " with passport number " + passportNumber + " departing from " + departure + " arriving " +
                "at " + destination);

        System.out.println("Your ticket have been sent to you mail");
    }
    void run(){
        String name;
    }
}
