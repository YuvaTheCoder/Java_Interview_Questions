package ImportantQuestions;

//import java.util.ArrayList;
//import java.util.Arrays;

public class SmallestAndLargestNumberInAnArray {
public static void main (String args[]) {

	
//Array initialization
	int arr2[] = {10,30,50,60,210,70,20,5};
	int smallest = arr2[0];
	int largest = arr2[0];
	//int result =arr2[0];
	
// First Finding the Smallest Value in an Array:
	for (int i=0 ; i<arr2.length; i++) {
		if ( smallest > arr2[i]) {
			smallest = arr2[i];
		}
		}
	System.out.println("The Smallest Number is :" + smallest );
	
	for (int j=0; j<arr2.length; j++) {
		if (largest <arr2[j]) {
			largest = arr2[j];
		}
	}
	System.out.println("The Largest Number is :" + largest);
	}
}
