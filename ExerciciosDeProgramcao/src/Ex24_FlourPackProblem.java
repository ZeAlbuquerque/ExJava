public class Ex24_FlourPackProblem {
     public static boolean canPack(int bigCount, int smallCount, int goal) {
 
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } 
         int fiveKilos = 5;
        int counter = smallCount;
        bigCount = fiveKilos * bigCount;
        int counter2 = bigCount;
        for (int i = -1; i < counter2; i++) {
            for (int j = -1; j < counter; j++) {
                if (bigCount + smallCount == goal) {
                    return true;
                }
                if(smallCount!=0)smallCount--;
            }
            if(bigCount!=0) bigCount = bigCount - fiveKilos;
            smallCount = counter;
        }
        return false;
    }
}