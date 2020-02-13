
public class Ex23_NumberToWords {

	public static void main(String[] args) {
		numberToWords(reverse(1000));
		System.out.println(getDigitCount(0));
	}

	public static int getDigitCount(int number) {
	    if (number < 0) return -1;
	    int counter = 0;
	    do {
	        number /= 10;
	        counter++;
	    } while (number > 0);
	    return counter;
	}
	 
	public static int reverse(int number) {
	    if (number == 0) return 0;
	 
	    boolean isNegative = number < 0;
	    number = Math.abs(number);
	    int reverse = 0;
	    while (number > 0) {
	        reverse *= 10;
	        reverse = reverse + (number % 10);
	        number /= 10;
	    }
	    return isNegative ? (-1) * reverse : reverse;
	}
	 
	public static void numberToWords(int number) {
	    if (number < 0) System.out.println("Invalid Value");
	    else {
	        int currentNumber = 0;
	        int digitsDifference = getDigitCount(number) - getDigitCount(reverse(number));
	        boolean hasZeros = digitsDifference > 0;
	        number = reverse(number);
	        do {
	            if (number != 0) currentNumber = number % 10;
	            else {
	                digitsDifference--;
	                hasZeros = digitsDifference > 0;
	            }
	            switch (currentNumber) {
	                case 0:
	                    System.out.println("Zero");
	                    break;
	                case 1:
	                    System.out.println("One");
	                    break;
	                case 2:
	                    System.out.println("Two");
	                    break;
	                case 3:
	                    System.out.println("Three");
	                    break;
	                case 4:
	                    System.out.println("Four");
	                    break;
	                case 5:
	                    System.out.println("Five");
	                    break;
	                case 6:
	                    System.out.println("Six");
	                    break;
	                case 7:
	                    System.out.println("Seven");
	                    break;
	                case 8:
	                    System.out.println("Eight");
	                    break;
	                case 9:
	                    System.out.println("Nine");
	                    break;
	                default:
	                    break;
	 
	            }
	            currentNumber = 0;
	            number /= 10;
	        } while (number > 0 || hasZeros);
	    }
	}
}

