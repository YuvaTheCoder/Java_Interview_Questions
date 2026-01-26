package ImportantQuestions;

// Here we converting the Integer to String for reversing.
//After reversing converting the String to Integer and Printing the result
public class ReverseTheInteger2 {
public static void main (String[] args) {
	int num1 = 12345;
	
//Conversion of Int to String:
	String rev = String.valueOf(num1);
	String result ="";
	
	for (int i=rev.length()-1; i>=0; i--) {
		result = result + rev.charAt(i);
		
	}
	
//Conversion of String into Int :
	int reversednum1 = Integer.parseInt(result);
	System.out.println("Reversed int is :" + reversednum1);
}
}
