
public class Ex18_sharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 13));
	}

	public static boolean hasSharedDigit(int first, int second) {
        if(first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }
 
        while(first > 0) {
            int firstNumberDigit = 0;
            firstNumberDigit  = first%10;
            int secondCopy = second;
 
            while(secondCopy > 0) {
                int secondNumberDigit = 0;
                secondNumberDigit = secondCopy%10;
                if(firstNumberDigit ==  secondNumberDigit) {
                    return true;
                }
                secondCopy /= 10;
            }
            first /= 10;
        }
 
 
        return false;
    }
}
