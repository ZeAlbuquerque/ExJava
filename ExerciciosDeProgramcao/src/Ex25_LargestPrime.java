
public class Ex25_LargestPrime {

	public static int getLargestPrime(int number)
	{
	    if (number < 2)
	    {
	        return -1;
	    }
	int largestPrime=0;
	    int counter=0;
	    for(int i=2;i<=number;i++)
	    {
	        //checking whether i is dividor of number
	        if(number%i==0) {
	            System.out.println(i+" is dividor of "+number);
	            //checking whether dividor is a prime number
	            for(int j=2;j<i;j++) {
	                if(i%j==0) {
	                    counter++;
	                }
	            }
	            if(counter<1){
	                largestPrime=i;
	            }
	          counter=0;
	        }
	    }
	    return largestPrime;
	}
}
