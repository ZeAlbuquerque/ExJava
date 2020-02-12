
public class Ex11_PlayingCat {

	public static boolean isCatPlaying(boolean summer, int temperature) {
		boolean isPlaying;
		
		if(summer == true && (temperature >= 25 && temperature <= 45)) {
			isPlaying = true;
		}else if(summer == false && (temperature >= 25 && temperature <= 35)) {
			isPlaying = true;
		}else {
			isPlaying = false;
		}	
		return isPlaying;
	}
}
