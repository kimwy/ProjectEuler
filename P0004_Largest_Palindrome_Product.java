
/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * Answer: 906609
 */


public class P0004_Largest_Palindrome_Product {
	public static void main(String[] args){
		
		int max=0;
		
		for(int num1=999;num1>100;num1--){
			for(int num2=999;num2>100; num2--){
				int result= num1 * num2;
				if(isPalindrome(result)) {
					if(result>max) max=result;
				}
			}
		}
		System.out.println(max);
		
	}
	
	public static boolean isPalindrome(int number){
		String numString=number+"";
		int length=numString.length();
		for(int i=0;i<length/2; i++){
			if(numString.charAt(i) != numString.charAt(length-1-i)) return false;
		}
		return true;
	}
	
}
