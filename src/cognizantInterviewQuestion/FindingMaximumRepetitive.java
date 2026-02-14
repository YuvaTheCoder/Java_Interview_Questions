package cognizantInterviewQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class FindingMaximumRepetitive {
public static void main (String[] args) {
	Integer[] arr = {1,2,3,3,4,5,6,5,5,2};

//Collections.frequency() works on Collections (List), not directly on arrays.
//So we convert the array into a List.
//Now list contains:
//[1,2,3,3,4,5,6,5,5,2]

	List<Integer> list = Arrays.asList(arr);
	int maxCount =0;  // stores the highest frequency found so far
	int maxNumber = arr[0];  // stores the number which has maximum frequency and initially first element of array.
	
	for (int num : list ) { //This is called Enhanced for Loop (for - each Loop)
//for (datatype variable : collection) {
//This loop goes through each element in the list one by one:
		int count = Collections.frequency(list, num); 
//returns how many times that element appears in the list.
/*Example:

For num = 1 → count = 1

For num = 2 → count = 2

For num = 3 → count = 2

For num = 5 → count = 3

 */
		if (count>maxCount) {
			maxCount = count;
			maxNumber = num;
		}
	}
	System.out.println("Maimum Repetitiver Number is :" + maxNumber);
	System.out.println("Repeated Time is :" + maxCount);	

}
}
