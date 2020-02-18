import java.util.Scanner;

public class Ex27_ImputCalcultator {
	public static void inputThenPrintSumAndAverage() {
		int sum = 0, counter = 0, current = 0;

		long average = 0l;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			if (scanner.hasNextInt()) {
				current = scanner.nextInt();
				counter++;
				sum += current;
				average = Math.round((double) sum / (double) counter);

			} else {
				System.out.println("SUM = " + sum + " AVG = " + average);
				scanner.close();
				break;
			}
		}
	}
}
