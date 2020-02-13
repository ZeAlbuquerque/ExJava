
public class Ex21_AllFactors {
	
	public static void main(String[] args) {
		printFactors(6);
	}

	public static void printFactors (int number) {
		if(number < 1) {
			System.out.println("Invalid Value");
		}
		
		for(int x = 1; x <= number; x++) {
			if(number % x == 0) {
				System.out.println(x + " is a factor of " + number);
			}
		}
	}
}
