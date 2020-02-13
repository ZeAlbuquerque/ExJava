
public class Ex13_NumberDaysInMonth {

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));

		System.out.println(getDaysInMonth(2, 1600));

	}

	public static boolean isLeapYear(int year) {
		boolean isLeap;

		if (year <= 0 || year > 9999) {
			isLeap = false;
		} else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			isLeap = true;
		} else {
			isLeap = false;
		}
		return isLeap;
	}

	public static int getDaysInMonth(int month, int year) {
		int dias;
		if (year < 1 || year > 9999) {
			dias = -1;
		} else {
			switch (month) {
			case 1:
				dias = 31;
				break;

			case 2:
				if (isLeapYear(year) == true) {
					dias = 29;
				} else {
					dias = 28;
				}
				break;

			case 3:
				dias = 31;
				break;

			case 4:
				dias = 30;
				break;

			case 5:
				dias = 31;
				break;

			case 6:
				dias = 30;
				break;

			case 7:
				dias = 31;
				break;

			case 8:
				dias = 31;
				break;

			case 9:
				dias = 30;
				break;

			case 10:
				dias = 31;
				break;

			case 11:
				dias = 30;
				break;

			case 12:
				dias = 31;
				break;

			default:
				dias = -1;
				break;

			}
		}
		return dias;
	}
}
