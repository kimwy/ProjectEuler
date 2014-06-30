
public class P0001_Multiples_of_3_and_5{
	
	/*
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * Answer: 233168
	 */

	public static void main(String[] args){
		
		int bound=1000;
		
		/*
		 * method 1: check every number below the upper bound
		 */
		int sum=0;
		for(int num=0; num<bound; num++){
			if(num%3==0 || num%5==0) sum += num;
		}
		
		
		System.out.println("(method 1) Sum = " + sum);
		
		
		/*
		 * method 2: mathematical approach
		 */
		int sum2=sum_multiples(3,bound) + sum_multiples(5,bound) - sum_multiples(15, bound);
		
		System.out.println("(method 2) Sum = " + sum2);

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
