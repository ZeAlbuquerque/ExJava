
public class Ex13_NumberDaysInMonth {
	
	public static void main(String[] args) {
		System.out.println(isLeapyear(-1600));
		System.out.println(isLeapyear(1600));
		System.out.println(isLeapyear(2017));
		System.out.println(isLeapyear(2000));

	}

	public static boolean isLeapyear (int year) {
	   boolean isLeap;
	   
	   if(year < 0 || year > 9999) {
		   isLeap = false;
	   }else if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 ==0)){
		   isLeap = true;
	   }else {
		   isLeap = false;
	   }   
	   return isLeap;
	}
}
