package ImportantQuestions;

public class CountWordsInAnString {
public static void main (String args[]) {
	String str = "YUVASURIYAN is a Developer";
	String[] spliting = str.split(" ");
	// split --> It is used to break a String into parts and it always return in Array
	int count = spliting.length;
	System.out.println("Total words in the Array is :" + count);
	}
}
