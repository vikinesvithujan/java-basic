import java.util.Scanner;

class palindromeFinder {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Text: ");
		String textValue = scanner.nextLine();		
		
		char[] a=textValue.toCharArray();
		char[] b = new char[a.length];
		int i=a.length-1;
		boolean boolText = true;
		for(char c:a){
			b[i] = c;	
			//System.out.println(b[i]);
			i--;
		}
		
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

