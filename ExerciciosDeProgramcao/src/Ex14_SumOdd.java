
public class Ex14_SumOdd {

	public static void main(String[] args) {

		System.out.println(sumOdd(1, 100));
	}

	 public static boolean isOdd(int number) {
			boolean status;
			
			if (number < 0) {
				status = false;
			} else if (number % 2 == 0) {
				status = false;
			} else {
				status = true;
			}
			return status;
		}

		public static int sumOdd(int start, int end) {
			int sum = 0;
			if ((start > end) || (start < 0)) {
				return -1;
			}
			for (int x = start; x <= end; x++) {
				if (isOdd(x)) {
					sum += x;
				}
			}
			return sum;
		}
}
