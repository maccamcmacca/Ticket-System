/**
 * @Author Ryan McAleaney
 * @Version 1.0.0 Full Release
 * @Copyright https://github.com/maccamcmacca/bankaccount/blob/master/LICENSE
 */

package myPack;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class main {
	public static String output;
	public static boolean ticketControlBool, control = false, acc = true;

	public static void main(String[] args) {

		input i = new input();
		Scanner sc = new Scanner(System.in);
		Output out = new Output();
		boolean loopControl = false;
		do {
			System.out.print("Hi! Welcome to the booking system, which function would you like?\n1: Enter information\n2: Output to text file\n3: Read details from file\n4: Exit\n");

			String a = "0";

			a = sc.next();
			switch (a) {

			case "1":
				i.getUserDetails();

				i.getTicketDays();// calls the function to get the ticket days

				do {

					i.getTransportMethod();

				} while (control == false);

				if (Details.carOrBus.equals("Car")) {
					i.getCarDays();
				}

				if (Details.carOrBus.equals("Bus")) {
					i.getBusTickets();
				}

				if (Details.carOrBus.equals("Other")) {
					System.out.print("");
				}

				i.getIfAccommodation();

				System.out.println("\nFirst Name: " + Details.Forename);
				System.out.println("Second Name: " + Details.Surname);
				System.out.println("Address: " + Details.Address);
				System.out.println("Postcode: " + Details.Postcode);
				System.out.println("Ticket Price: " + Details.tickets);
				if (Details.carOrBus.equals("Car")) {
					System.out.println("Parking Ticket: " + Details.parking);
				}
				if (Details.carOrBus.equals("Bus")) {
					System.out.println("Bus Ticket: " + Details.busTicket);
					System.out.println();
				}
				if (Details.carOrBus.equals("Other")) {
					System.out.println("Arranging own travel");
					System.out.println();
				}
				System.out.println("Accomodation: " + Details.accomodation);
				System.out.println();

				break;
			case "2":

				Output.writer();
				System.out.println("Details written to file"); 
				break;
			case "3":
				try {
					Output.readFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case "4":
				loopControl = true;
				break;
			default:
				System.out.println("Enter a number between 1 and 4");
				break;
			}

		} while (loopControl == false);
		sc.close();
	}

}
