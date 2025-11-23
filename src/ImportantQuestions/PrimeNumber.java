package ImportantQuestions;

/* Conditions for PrimeNumber
 * A prime number is a number greater than 1
 * It must be divisible only by 1 and itself
 * We check numbers from 2 to num/2
 * If any number divides it → not prime
 */

public class PrimeNumber {
	public static void main (String args[]) {
		int num = 12;
		boolean isPrime = true;
		
		if (num <=1) {      //Numbers 0, 1, and negatives are not prime
			isPrime = false;
		}else{
			for (int i =2 ; i<=num/2; i++) {
				if(num % i ==0) {
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


