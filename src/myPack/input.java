/**
 * @Author Ryan McAleaney
 * @Version 1.0.0 Full Release
 * @Copyright https://github.com/maccamcmacca/Ticket-System/blob/master/LICENSE
 */

package myPack;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class input {

	Scanner sc = new Scanner(System.in);

	public void getTicketDays() {
		do {
			try {
				System.out.print("\nEnter how many days of admission you would like: \n1 day: £80.00\n2 days: £150.00\n3 days: £230.00\n");
				Details.daysTickets = sc.nextInt();
				switch (Details.daysTickets) {
				case 1:
					Details.tickets = 80.00;
					// break;
				case 2:
					Details.tickets = 150.00;
					// break;
				case 3:
					Details.tickets = 230.00;
					// break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error, Enter an integer between 1 & 3");
				sc.next();
				getTicketDays();
			}
			if (Details.daysTickets <= 0 || Details.daysTickets >= 4) {
				System.out.println("Error, Enter an integer between 1 & 3");
			}
		} while (Details.daysTickets < 1 || Details.daysTickets > 3);
	}

	public void getCarDays() {

		do {
			try {
				System.out.print("\nEnter how many days of parking you would like:\n1 day: £12.50\n2 days: £25.00\n3 days: 37.50\n");
				Details.daysParking = sc.nextInt();
				switch (Details.daysParking) {
				case 1:
					Details.parking = 12.50;
				case 2:
					Details.parking = 25.00;
				case 3:
					Details.parking = 37.50;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error, Enter an integer between 1 & 3");
				sc.next();
				getCarDays();
			}
			if (Details.daysParking <= 0 || Details.daysParking >= 4) {
				System.out.println("Error, Enter an integer between 1 & 3");
			}
		} while (Details.daysParking <= 0 || Details.daysParking >= 4);
	}

	public void getBusTickets() {
		do {
		try {
			System.out.print("\nEnter the amount of bus tickets you would like:\n1 day: £10\n2 days: £20\n3 days: £30\n");
			Details.daysBus = sc.nextInt();

			switch (Details.daysBus) {
			case 1:
				Details.busTicket = 10.00;
			case 2:
				Details.busTicket = 20.00;
			case 3:
				Details.busTicket = 30.00;
			}
		} catch (InputMismatchException e) {
			System.out.println("Error, Enter an integer between 1 & 3");
			sc.next();
			getBusTickets();
		}
		if (Details.daysBus <= 0 || Details.daysBus >= 4) {
			System.out.println("Error, Enter an integer between 1 & 3");
		}
		} while (Details.daysBus <= 0 || Details.daysBus >= 4);
		
	}

	public void getTransportMethod() {
		System.out.println("Valid input is Car, Bus and Other respectively\n");
		System.out.print("Are you taking a Car, Bus or Other source?: ");
		Details.carOrBus = sc.next();
		if ("Car".equals(Details.carOrBus) || "Bus".equals(Details.carOrBus) || "Other".equals(Details.carOrBus)) {
			main.control = true;
		} else
			System.out.println("Invalid input");
	}

	public void getIfAccommodation() {
		do {
			try {
				System.out.print("\nWhat accommodation would you like: \n1: £135 Tent\n2: £71 Self Pitch\n3: Will find Own ");
				Details.accomodationPrice = sc.nextInt();
				switch (Details.accomodationPrice) {
				case 1:
					Details.accomodation = 135.00;
					break;
				case 2:
					Details.accomodation = 71.00;
					break;
				case 3:

					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Error, Enter an integer that is either 1 or 2");
				sc.next();
				getIfAccommodation();
			}
			if (Details.accomodationPrice <= 0 || Details.accomodationPrice >= 4) {
				System.out.println("Error, Enter an integer between 1 & 3");
			}
		} while (Details.accomodationPrice <= 0 || Details.accomodationPrice >= 4);

		

	}

	public void getUserDetails() {
		System.out.print("\nEnter First Name: ");
		//sc.next();
		Details.Forename = sc.nextLine();

		System.out.print("Enter Last Name: ");
		Details.Surname = sc.nextLine();

		System.out.print("Enter Address: ");
		Details.Address = sc.nextLine();

		System.out.print("Enter Postcode: ");
		Details.Postcode = sc.nextLine();
		System.out.print("\n");
	}

}
