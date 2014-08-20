/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 
 * Answer: 6857
 */


public class P0003_Largest_Prime_Factor {
	public static void main(String[] args) {
		
		long bound=600851475143L;
		
		for(long i=(long) Math.sqrt(bound); i>0; i--){
			if(bound % i == 0 && isPrime(i)){
					System.out.println(i);
					break;
			}
		}
	}
	
	private static boolean isPrime(long number){
		for(int i=2; i< number/2; i++){
			if(number%i == 0) return false;
		}
		return true;
	}

}
