
public class Ex3_BarkingDog {
	
	public static boolean shouldWakeUp (boolean barking, int hourOfTheDay) {
		boolean wakeUp;
		if(hourOfTheDay < 0 || hourOfTheDay > 23) {
			wakeUp = false;
		}else if(barking == true && (hourOfTheDay > 22 || hourOfTheDay < 8)) {
			wakeUp = true;
		}else {
			wakeUp = false;
		}
		return wakeUp;
	}

}
