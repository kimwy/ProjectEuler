
public class P0002_Even_Fibonacci_Numbers {

	/*
	 * Fibonacci Numbers:
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * find the sum of the even-valued terms (do not exceed 4 million)
	 *
	 * Answer: 4613732
	 */
	
	public static void main(String[] args){
		int prevFirst=0;
		int prevSecond=1;
		int bound=4_000_000;
		int evenSum=0;
		
		while(true){
			int newFib=prevFirst + prevSecond;
			prevFirst = prevSecond;
			prevSecond = newFib;
			
			if(newFib > bound)	break;
			
			if(newFib % 2 == 0){
				evenSum += newFib;
			}
		}
		
		System.out.println(evenSum);
	
	}
	
}
