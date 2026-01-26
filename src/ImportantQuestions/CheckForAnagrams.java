package ImportantQuestions;

import java.util.Arrays;

// listen -> silent
//race -> care
public class CheckForAnagrams {
public static void main (String args[]) {
	String s1 = "silet";
	String s2 = "listen";
	
	
	//Removing all the white spaces and converting to Lower cases:
	
	s1 = s1.replaceAll("//s", "").toLowerCase();
	s2 = s2.replaceAll("//s", "").toLowerCase();
	
	
	//Comparing the lengths of s1 and s2
	
	if (s1.length() != s2.length()) {
		System.out.println("Not an Anagram --> Characters Mismatch");
		return;   //exits the entire program.
	}
	
	
	//Converting the String to Array:
	char[] arr1 = s1.toCharArray();
	char[] arr2 = s2.toCharArray();
	
	Arrays.sort(arr1);   // Sort will arange into Ascending order
	Arrays.sort(arr2);
	
	if (Arrays.equals(arr1,arr2)) {
		System.out.println("Its an Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
	


}

} 
