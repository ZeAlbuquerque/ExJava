package program;

import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Test {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = tec.nextInt();
		System.out.print("Holder: ");
		String holder = tec.next();
		tec.nextLine();
		System.out.print("Initial balance: ");
		double balance = tec.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = tec.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("");
		
		System.out.println("Enter amount for withdraw: ");
		double amount = tec.nextDouble();
		account.withdraw(amount);
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		tec.close();
	}
}
