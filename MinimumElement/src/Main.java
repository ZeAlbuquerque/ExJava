import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner tec = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digit the array length: ");
		int[] returnedArray = readIntegers(tec.nextInt());
		int returnedMin = findMin(returnedArray);
		
		System.out.println();
		
		System.out.println("The minimum is: " + returnedMin);
		
	}

	private static int[] readIntegers(int count) {
		int[] array = new int[count];
		for(int i = 0; i < count; i++) {
			System.out.print("Enter a number: ");
			array[i] = tec.nextInt();
		}
		 tec.close();
		return array;
	}
	
	private static int findMin (int[] array) {
		 Arrays.sort(array);
		 int min = array[0];
		 return min;
	}
	
}
