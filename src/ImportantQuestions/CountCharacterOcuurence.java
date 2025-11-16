package ImportantQuestions;

public class CountCharacterOcuurence {
public static void main (String args[]) {
	String s ="Yuvasuriyan";
	int count = s.length() - s.replace("a","").length();
System.out.println(count);	
}
}
