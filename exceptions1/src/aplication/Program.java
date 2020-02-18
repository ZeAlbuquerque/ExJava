package aplication;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
		System.out.print("Room number: ");
		int roomNumber = tec.nextInt();
		System.out.print("Check-in date (DD/MM/YYYY)): ");
		Date checkIn = sdf.parse(tec.next());
		System.out.print("Check-out date (DD/MM/YYYY): ");
		Date checkOut = sdf.parse(tec.next());

		Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
		System.out.println("Reservation: " + reservation);
		System.out.println("");

		System.out.println("Enter data to update the reservation");
		System.out.print("Check-in date (DD/MM/YYYY)): ");
		checkIn = sdf.parse(tec.next());
		System.out.print("Check-out date (DD/MM/YYYY)): ");
		checkOut = sdf.parse(tec.next());

		reservation.updateDates(checkIn, checkOut);
		System.out.println("Reservation: " + reservation);
		}
		catch(ParseException e){
			System.out.println("Invalid date format");
		}
		catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}

		tec.close();
	}

}
