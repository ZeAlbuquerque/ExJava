package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner tec = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int roomNumber = tec.nextInt();
		System.out.print("Check-in date (DD/MM/YYYY)): ");
		Date checkIn = sdf.parse(tec.next());
		System.out.print("Check-out date (DD/MM/YYYY): ");
		Date checkOut = sdf.parse(tec.next());

		if (!checkOut.after(checkIn)) {
			System.out.print("Error in reservation: check_out date must be after check-in date");

		} else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println("");

			System.out.println("Enter data to update the reservation");
			System.out.print("Check-in date (DD/MM/YYYY)): ");
			checkIn = sdf.parse(tec.next());
			System.out.print("Check-out date (DD/MM/YYYY)): ");
			checkOut = sdf.parse(tec.next());

			String error = reservation.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				System.out.println("Reservation: " + reservation);
			}

		}
		tec.close();
	}

}
