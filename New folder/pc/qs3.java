import java.util.Scanner;

public class qs3 {
    public static void main(String[] args) {

        int num, t1 = 1, t2 = 1, i = 1;

        Scanner scanner = new Scanner(System.in);
    		System.out.print("Enter the Number of Times: ");
    		num = scanner.nextInt();

        System.out.print("First " + num + " Fibonacci Numbers: ");

        do {

          System.out.print(t1 + " ");
          int sum = t1 + t2;
          t1 = t2;
          t2 = sum;

          i++;

        } while(i <= num);
    }
}
