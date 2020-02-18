
public class Ex4_LeapYearCalculator {

	public static boolean isLeapYear (int year) {
		boolean leapOrNot = false;
		if(year >= 1 && year <= 9999) {
			if(year % 4 == 0 && year % 100 != 0 && year % 400 ==0) {
				leapOrNot = true;
			}else {
				leapOrNot = false;
			}
		}

		return leapOrNot;


	}

}
