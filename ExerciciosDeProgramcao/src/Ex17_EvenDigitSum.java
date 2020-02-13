
public class Ex17_EvenDigitSum {
	
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(252));
	}

	
	public static int getEvenDigitSum (int number) {
		int sum = 0;
		int aux = 0;
		if(number < 0) {
			return -1;
		} else{
		  while(number != 0) {
			  aux = number % 10;
			  number /= 10;
			  if(aux % 2 == 0) {
				  sum += aux;
			  }
		  }
		  return sum;
		}
	}
}
