package array;

/* For finding smallest or largest in an array, 
initialize both with the first element of the array, not with 0.

======================================================================
For Adding the Array Integer we can initialize the integer with 0.
*/

public class LargestNumberInAnArray {
public static void main (String[] args) {
	int[] arr1 = {10,20,30,15,5,17,3};
	int sum = 0;       // For adding all the Array Integers
	int largest =arr1[0];    //For Finding the largest integer in an Array
	int smallest =arr1[0];   // For Finding the Smallest integer in an Array
	
	for (int i=0; i<arr1.length; i++) {
		sum = sum + arr1[i];
		if (arr1[i] >largest) {
			largest = arr1[i];
		}
		if (arr1[i] <smallest) {
			smallest = arr1[i];
		}
	}
	System.out.println("Total Values are :" + sum);
	System.out.println("Largest Number in an Array :" + largest);
	System.out.println("Smallest Number in an Array : " + smallest);
}
}
