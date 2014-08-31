/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * Answer: 232792560
 */


public class P0005_Smallest_Multiple {
	public static void main(String[] args) {
		
		int result=20;
		for(int i=1;;i++){
			if(result%i != 0){
				result++;
				i=0;
			}
			if(i==20) break;
		}
		
		System.out.println(result);
	}

}
