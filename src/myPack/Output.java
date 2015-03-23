/**
 * @Author Ryan McAleaney
 * @Version 1.0.0 Full Release
 * @Copyright https://github.com/maccamcmacca/Ticket-System/blob/master/LICENSE
 */

package myPack;

import java.io.*;

public class Output {

	public static String readFile() throws IOException {

		FileReader fr = new FileReader("Concert.txt");
		BufferedReader readText = new BufferedReader(fr);
		StringBuffer stringBuffer = new StringBuffer();

		String line;
		String s = "";
		int count = 0;

		while ((line = readText.readLine()) != null) {

			stringBuffer.append(line);
			stringBuffer.append("\n");

		}
		System.out.println(stringBuffer.toString());
		readText.close();

		return line;
	}

	public static void writer() {
		try {

			FileWriter fw = new FileWriter("Concert.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("First Name: " + Details.Forename);
			bw.newLine();
			bw.write("Second Name: " + Details.Surname);
			bw.newLine();
			bw.write("Address: " + Details.Address);
			bw.newLine();
			bw.write("Postcode: " + Details.Postcode);
			bw.newLine();
			bw.write("Ticket Price: " + Details.tickets);
			bw.newLine();
			if (Details.carOrBus.equals("Car")) {
				bw.write("Parking Ticket: " + Details.parking);
				bw.newLine();
			}
			if (Details.carOrBus.equals("Bus")) {
				bw.write("Bus Ticket: " + Details.busTicket);
				bw.newLine();
			}
			if (Details.carOrBus.equals("Other")) {
				bw.write("Arranging own travel");
				bw.newLine();
			}

			bw.write("Accomodation: " + Details.accomodation);
			bw.newLine();

			bw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
