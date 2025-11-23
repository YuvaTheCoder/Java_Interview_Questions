package ImportantQuestions;

public class ReverseTheString2 {
public static void main (String args[]) {
	String rev = "Yuvan";
	String result="";
	
	for (int i= rev.length()-1 ; i>=0; i--) {
		result = result+ rev.charAt(i);
		}
	if (result.equals(rev)) {
		System.out.println("The string is equal");
	}else {
		System.out.println("String is not equal");
	}
	System.out.println(result);
}
}
