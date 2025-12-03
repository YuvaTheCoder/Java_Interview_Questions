package ImportantQuestions;

public class VowelsCount {
	public static void main (String args[]) {
		String str = "Yuvasuriyan";
		int vowels = 0;
		String str1 = str.toLowerCase();
		System.out.println("The Word we are checking is :" + str1);
		
		for (int i = 0 ; i <str1.length(); i++) {
			char ch = str1.charAt(i);
		if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			vowels++;
			}
		
	}
		System.out.println("Total Vowels in the Word is " + vowels);
		}
	}

