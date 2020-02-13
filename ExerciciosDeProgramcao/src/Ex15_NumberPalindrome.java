
public class Ex15_NumberPalindrome {
	
	public static boolean isPalindrome(int number) {

		int originalNumber = number;
		int reversedNumber = 0;

		while (number != 0) {
			reversedNumber = (reversedNumber * 10) + number % 10;
			number /= 10;
		}
		return originalNumber == reversedNumber;
	}
}

