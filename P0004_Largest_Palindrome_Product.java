
/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * Answer: 906609
 */


public class P0004_Largest_Palindrome_Product {
	public static void main(String[] args){
		
		outermost:
		for(int result=999*999;result>100000;result--){
			if(isPalindrome(result)){
				
				for(int num1=999;num1>100;num1--){
					if(result % num1 == 0){
						int num2=result/num1;
						if(100<num2 && num2<999){
							System.out.println(result);
							break outermost;
						}
							
						}
					}
				}
			}
		
	}
	
	public static boolean isPalindrome(int number){
		int reverse=0;
		int temp=number;
		for(int i=0;i<=temp;i++){
			int remainder=temp%10;
			reverse = reverse*10 + remainder;
			temp /= 10;
		}
		return reverse == number;
	}
	
}
