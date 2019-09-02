import java.util.Scanner;

public class qs5 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
    		System.out.print("Enter the Integer Value: ");
    		number = scanner.nextInt();


        System.out.print("Factors of " + number + " are: ");
        for(int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
