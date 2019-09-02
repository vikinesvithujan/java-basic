class swapVariableValue {
	public static void main(String args[]) {
		int num1 = 5;
		int num2 = 7;
		System.out.println("FIRST NUMBER IS: " + num1);
		System.out.println("SECOUND NUMBER IS: " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("AFTER SAWP");
		System.out.println("FIRST NUMBER IS: " + num1);
		System.out.println("SECOUND NUMBER IS: " + num2);
	}
}