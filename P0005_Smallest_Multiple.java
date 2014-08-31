
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * Answer: 232792560
 */


public class P0005_Smallest_Multiple {
	public static void main(String[] args) {
		
		int bound=20;
		int[] num=new int[bound];
		for(int i=0;i<bound;i++){
			num[i] = i+1;
		}
		System.out.println(lcm(num));
	}
	
	private static int gcd(int a, int b){
	    while(b>0){
	        int temp=b;
	        b=a%b;
	        a=temp; //divisor
	    }
	    return a;
	}

//	private static int gcd(int[] nums){
//	    int result=nums[0];
//	    for(int i=1; i<nums.length; i++){
//	    	result = gcd(result, nums[i]);
//	    }
//	    return result;
//	}
	
	private static int lcm(int a, int b){
	    return a * (b / gcd(a, b));
	}

	private static int lcm(int[] nums){
	    int result = nums[0];
	    for(int i= 1; i<nums.length; i++){
	    	result = lcm(result, nums[i]);
	    }
	    return result;
	}

}
