package ImportantQuestions;
import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArrayAscending {
public static void main (String args[]) {
	int[] arr1 = {5,4,10,55,7,1};

	Arrays.sort(arr1);
	System.out.println("Ascending Order of Arrays are :");
	for (int x : arr1) {
		System.out.println(x);
}
	System.out.println("Descending Order of Arrays are : ");
	for (int j=arr1.length-1 ; j>=0; j--) {
		System.out.println(arr1[j]);
	}
	}
}