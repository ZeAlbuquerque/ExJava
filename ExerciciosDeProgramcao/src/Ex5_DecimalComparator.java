
public class Ex5_DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
		 
        int FirstNumber = (int)(firstNumber*1000);
        int SecondNumber = (int)(secondNumber*1000);
 
        if (FirstNumber == SecondNumber){
            return true;
        }
        return false;
 
    }
}
