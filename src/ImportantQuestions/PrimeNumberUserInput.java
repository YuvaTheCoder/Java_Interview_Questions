package ImportantQuestions;

import java.util.Scanner;

public class PrimeNumberUserInput {

	public static void main (String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number want to Check its a Prime :");
		num = sc.nextInt();
		System.out.println("Entered number is : " + num);
		sc.close();
		boolean isPrime = true;
		
		if (num <=1) {
			System.out.println("Number is Not Eligible");
		}else {
			for (int i=2; i<=num/2; i++) {
				if (num %2 ==0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println("The Number is prime");
		}else {
			System.out.println("The Number is Not prime");
		}
	}
}
