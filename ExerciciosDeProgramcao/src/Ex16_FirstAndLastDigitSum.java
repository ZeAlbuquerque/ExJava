
public class Ex16_FirstAndLastDigitSum {
	
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(-10));
	}

	public static int sumFirstAndLastDigit(int number) {
		int lastDigit = 0;
		int firstDigit = 0;

		if (number < 0) {
			return -1;
		} else {
			lastDigit = (number % 10);
			while (number != 0) {
				firstDigit = number % 10;
				number /= 10;
			}
			return firstDigit + lastDigit;
		}
	}

}
