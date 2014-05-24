
public class P0001_Multiples_of_3_and_5 {
	
	/*
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * Answer: 233168
	 */

	public static void main(String[] args){
		
		int bound=1000;
		
		System.out.println("Bound = "+bound);
		
		/*
		 * method 1: check every number below the upper bound
		 */
		long startTime_1=System.nanoTime();
		
		int sum=0;
		for(int num=0; num<bound; num++){
			if(num%3==0 || num%5==0) sum += num;
		}
		
		long elapsedTime_1=System.nanoTime() - startTime_1;
		double timeTook_1=elapsedTime_1 * (1.0e-9);
		
		System.out.println("Sum = " + sum);
		System.out.println("Method 1 takes " + timeTook_1 + " seconds.");
		
		
		/*
		 * method 2: mathematical approach
		 */
		long startTime_2=System.nanoTime();
		
		int sum2=sum_multiples(3,bound) + sum_multiples(5,bound) - sum_multiples(15, bound);
		
		long elapsedTime_2=System.nanoTime() - startTime_2;
		double timeTook_2=elapsedTime_2 * (1.0e-9);
		
		//System.out.println("Sum = " + sum2);
		System.out.println("Method 2 takes " + timeTook_2 + " seconds.");

	}
	
	
	/*
	 * summation - [from k=1 to count] of (divisor*k)
	 * using the identity 1+2+3....n = n*(n+1)/2;
	 */
	private static int sum_multiples(int divisor, int bound){
		bound -= 1;
		int count=bound/divisor;
		return divisor * (count+1) * count / 2 ;
	}

}
