
public class Ex22_PerfetNumber {

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
	}
	
	public static boolean isPerfectNumber (int number) {
		int sum = 0;
		if(number < 1) {
			return false;
		}
		for(int x = 1; x < number; x ++) {
			if(number % x == 0) {
				sum += x;
			}
		}
		if(sum == number) {
			return true;
		}else {
			return false;
		}
	}
}
