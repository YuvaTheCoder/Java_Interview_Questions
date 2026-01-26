package ImportantQuestions;

public class FactorialOfaNumber {
	public static void main (String args[]) {
	int num1 = 5;
	int fact = 1;
	
	for (int i=1; i<=num1; i++) {    // I should be i=1; If we declare i=0; final output will be also 0
		fact = fact *i;
	}
	System.out.println(fact); 
	}
}


/*
i=1 → fact = 1×1 = 1
i=2 → fact = 1×2 = 2
i=3 → fact = 2×3 = 6
i=4 → fact = 6×4 = 24
i=5 → fact = 24×5 = 120

 */