// Note : This program works only for Three digit Number 

package ImportantQuestions;

public class ArmstrongNumber {
	public static void main (String[] args) {
int num = 153;

int a = num/100;   // Finding the First Digit 
int b = (num /10) % 10;  //Finding the Second Digit 
int c= num % 10;  //Finding the Last Digit

int result = (a*a*a) + (b*b*b) + (c*c*c);

//Ternary Operator :
System.out.println(num == result ? "Amstrong" :"Not Amstrong ");
}
	}