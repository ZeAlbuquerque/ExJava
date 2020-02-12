
public class Ex7_TeenNumberChecker {

	public static boolean hasTeen (int n1, int n2, int n3) {
		boolean has;
		
		if((n1 >= 13 && n1 <= 19) || (n2 >= 13 && n2 <= 19) || (n3 >= 13 && n3 <= 19)) {
			has = true;
		}else {
			has = false;
		}
		
		return has;
		
	}
	
	public static boolean isTeen (int n1) {
		boolean has;
		
		if(n1 >= 13 && n1 <= 19) {
			has = true;
		}else {
			has = false;
		}
		
		return has;
		
	}
	
	
}
