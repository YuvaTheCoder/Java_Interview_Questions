package ImportantQuestions;

import java.util.Scanner;

public class FactorialOfaNumberUserInput {
public static void main (String[] args) {
	int num1;
	int fact = 1;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The Number for Factorial :");
	num1 = sc.nextInt();
	System.out.println("The Entered Num is :" + num1);
	sc.close();
	
	for (int i=1; i<=num1; i++) {  // i Initialization should not be 0, otherwise the result will be Zero.
		fact = fact*i;
		
	}
	System.out.println("Factorial is :" + fact);
}
}
