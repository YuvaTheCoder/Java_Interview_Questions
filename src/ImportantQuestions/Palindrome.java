package ImportantQuestions;

public class Palindrome {
public static void main (String[] args) {
	String s1= "malayalam";
	int len = s1.length();
	String rev ="";
	
	
	for (int i=len-1; i>=0; i--) {
		rev = rev + s1.charAt(i);      // Conversion of String to Char
	}
	if (rev.equals(s1)){
			System.out.println("It is Plaindrome");
		}else {
			System.out.println("It is Not a Palindrome");
		}
	}
}
