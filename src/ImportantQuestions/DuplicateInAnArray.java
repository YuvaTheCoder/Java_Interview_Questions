package ImportantQuestions;

public class DuplicateInAnArray {
public static void main (String args[]) {
	int[] arr1 = {10,20,30,30,40,40,50};
	
	for (int i = 0; i<arr1.length; i++) {  //Holding values constant
		
		for (int j=i+1; j<arr1.length; j++) {  // Right side values will change one by one
			if(arr1[i] == arr1[j]) {
				System.out.println("Duplicates in an Array are :" + arr1[i]);
				
			}
		}
	
	}
}
}
