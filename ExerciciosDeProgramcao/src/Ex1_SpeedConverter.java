
public class Ex1_SpeedConverter {
	
	public static long toMilesPerHour (double kilometerPerHour){
		if(kilometerPerHour < 0){
			return -1;
		}else {
			
			//Método Math.round retorna um long, desta forma podemos converter o double do parametro
			long milesPerHour = Math.round(kilometerPerHour / 1.609);
			return milesPerHour;
		}
	}

	public static void printConversion (double kilometersPerHour){
		if(kilometersPerHour < 0){
			System.out.println("Invalid Value");
		} else{
			System.out.println(kilometersPerHour + " KM/H = " + toMilesPerHour(kilometersPerHour) + " MI/H" );
		}
	}
	
	public static void main(String[] args) {
		printConversion(1.5);
	}
}


