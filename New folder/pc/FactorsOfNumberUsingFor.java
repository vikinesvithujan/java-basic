package SimplerPrograms;

import java.util.Scanner;

public class FactorsOfNumberUsingFor {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Number, i;
		sc = new Scanner(System.in);
		
		System.out.println("Please Enter any number to Find Factors: ");
		Number = sc.nextInt();
		
		for(i = 1; i <= Number; i++) {
			if(Number%i == 0) {
				System.out.format(" %d  ", i);
			}
		}
	}
}