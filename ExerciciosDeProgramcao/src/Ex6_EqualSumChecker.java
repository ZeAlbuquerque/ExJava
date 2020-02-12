
public class Ex6_EqualSumChecker {

	public static boolean hasEqualSum(int n1, int n2, int n3) {
		boolean isEqual;
		
		if((n1 + n2) == n3){
			isEqual = true;
		}else {
			isEqual = false;
		}
		
		return isEqual;
	}
	
}
