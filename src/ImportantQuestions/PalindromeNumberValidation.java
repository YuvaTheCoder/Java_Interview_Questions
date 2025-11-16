package ImportantQuestions;
public class PalindromeNumberValidation {
    public static void main(String[] args) {
        int num = 121;   // You can change this number
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;          // Get last digit
            reversedNum = reversedNum * 10 + digit;  // Build reversed number
            num = num / 10;                // Remove last digit
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome");
        }
    }
}
