
public class teste {

	public static void main(String[] args) {

		int sumNumbers = 0;
		int cont = 0;
		for (int number = 1; number <= 1000; number++) {
			if ((number % 3 == 0) && (number % 5 == 0)) {
				sumNumbers += number;
				System.out.println("Found Number : " + number);
				cont++;
			}
			if (cont == 5) {
				break;
			}
		}

		System.out.println("Sum of numbers: " + sumNumbers);
	}

}
