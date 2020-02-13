
public class Ex19_LastDigitChecker {

	public static boolean hasSameLastDigit(int n1, int n2, int n3) {
		
		if (!isValid(n1) || !isValid(n2) || !isValid(n3) ) {
			return false;
		} else if (n1 % 10 == n2 % 10 || n1 % 10 == n3 % 10 || n2 % 10 == n3 %10) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isValid(int number) {
		if (number >= 10 && number <= 1000) {
			return true;
		} else {
			return false;
		}
	}
}
