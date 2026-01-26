package ImportantQuestions;

/* Conditions for PrimeNumber
 * A prime number is a number greater than 1
 * It must be divisible only by 1 and itself
 * Condition : If a number has a divisor (other than 1 and itself), it must be ≤ num/2.
 * If any number divides it → not prime
 */

public class PrimeNumber {
	public static void main (String args[]) {
		int num = 13;
		boolean isPrime = true;
		
		if (num <=1) {      //Numbers 0, 1, and negatives are not prime
			isPrime = false;
		}else{
			for (int i =2 ; i<=num/2; i++) { //Every number is divisible by one. so, no need to check for 1
				if(num % i ==0) {     //loop runs i=2,3,4,5,6
					isPrime = false;
					break;
				}
			}
				}
		if (isPrime) {
			System.out.println("The Number is Prime");
		}else {
			System.out.println("The Number is Not Prime");
		}
			}
		
		}
