
public class Ex20_GreatestCommonDivisor {

	public static int getGreatestCommomDivisor (int first, int second) {
		if(first < 10 || second < 10) {
			return -1;
		}
		
		for (int x = first; x > 0; x--) {
            for (int y = second;y > 0;y--){
                if ((first % x == 0)&&(second % y == 0) && (x==y)){
                    return x;
                }
            }
        }
        return -1;
	}
}
