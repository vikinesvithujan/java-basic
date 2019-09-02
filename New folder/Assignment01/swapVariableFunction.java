import java.util.Scanner;

class swapVariableFunction {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;
		
		
		System.out.println("ENTER THE FIRST NUMBER: ");
		num1 = scanner.nextInt();
		System.out.println("ENTER THE SECOUND NUMBER: ");
		num2 = scanner.nextInt();
		
		swapTwoValue(num1, num2);
		
		
}
	
// SWAP VARIABLE =================================================

public static void swapTwoValue(int numOne, int numTwo) {
	
	int temp;
	
	temp = numOne;
	numOne = numTwo;
	numTwo = temp;
	
	System.out.println("AFTER SAWP");
	System.out.println(" ");
	System.out.println("FIRST NUMBER IS: " + numOne);
	System.out.println("SECOUND NUMBER IS: " + numTwo);
}


// ===============================================================
}

