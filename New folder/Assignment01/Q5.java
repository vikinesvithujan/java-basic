import java.util.Scanner;

class compareTwoWords {
	public static void main(String args[]) {
		
		char[] a = {'V','I','J','A','Y'};
		char[] b = {'A','J','I','T','H'};
		
		
		boolean boolText = true;		
		
		for(int j = 0; j<=b.length-1; j++) {
			
			if (a[j] != b[j]) {
				boolText = false;
			}
		}
		
		if (boolText == true) {
			System.out.println("You Entered Palindrome Word");
		} else {
			System.out.println("The Word is not Palindrome Word");
		}
		
	}

}

