package ImportantQuestions;
//Fibonacci Series is nothing but adding of two before integers, it usually starts with 0

public class FibonacciSeries {
	public static void main (String args[]) {
		int firstnum =0;
		int secondnum = 1;
		int temp;
		
		for (int i = 0; i<=10; i++) {
		    
			temp = firstnum + secondnum;
			System.out.println(temp);
			firstnum = secondnum;
			secondnum = temp;
			
	}}
}


