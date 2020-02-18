import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		
		System.out.println("Original: " + Arrays.toString(array));
		
		reverse(array);
		
		System.out.println("Reversed: " + Arrays.toString(array));
	}

	/*
	private static void reverse(int[] array){
		int[] reversedArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			reversedArray[array.length - 1 - i] = array[i];
		}
	}
	*/
	
	private static void reverse(int[] array) {
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		for(int i = 0; i < halfLength; i++) {
			int aux = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = aux;
		}
	}
	
}
