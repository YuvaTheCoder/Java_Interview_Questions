package ImportantQuestions;

public class ReverseTheString2 {
public static void main (String args[]) {
	String rev = "Yuvan";
	String result="";
	
	for (int i= rev.length()-1 ; i>=0; i--) {
		result = result+ rev.charAt(i);
		}
	System.out.println(result);
}
}
