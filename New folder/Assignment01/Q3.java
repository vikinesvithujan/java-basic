import java.util.Scanner;

class charPrints {
	public static void main(String args[]) {
		
		char[] b = {'A','B','C','D','E','F','G','H','I','J','K'};
		
		//System.out.println("Charector is in reverse: " + b[5]);
		System.out.println("Charector is in reverse: \n");
		for(int i = b.length-1; i>=0; i--) {
			System.out.print(b[i]);
		}
		System.out.println(" ");
	}

}

