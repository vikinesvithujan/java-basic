import java.util.Scanner;

class ReverseNumber {
	public static void main(String args[]) {

	/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Text: ");
		String textValue = scanner.nextLine();*/

		int count1 = 0;
		int count2 = 1;
		int reminder;
		int f = 1;
		int num;
		int temp;
		int reversVal = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Integer Value: ");
		num = scanner.nextInt();
		temp = num;

		while(temp != 0) {
		  temp = temp / 10;
			count1++;
		}
		while(count2 < count1) {
			f = f * 10;
			count2++;
		}
		while(num != 0) {
			reminder = num%10;
			num = num/10;
			reversVal = reversVal + (reminder*f);
			f = f/10;
		}
		System.out.println("Revers Value is: " + reversVal);
    }
  }
