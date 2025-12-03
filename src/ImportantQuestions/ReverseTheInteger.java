package ImportantQuestions;

public class ReverseTheInteger {
	public static void main (String args[]) {
		int num = 1234;
		int reverse =0;
		
		while (num!=0) {
			int lastdigit = num %10;  //Extract last digit  // % will give --> Remainder
			reverse = reverse *10 + lastdigit; //Build reverse number  
			num = num/10;  //Remove last digit
			}
		System.out.println(reverse);
	
	}

}
