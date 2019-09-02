import java.util.Scanner;

public class qq {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    		System.out.print("Enter the word: ");
    		num = scanner.nextline();

      String givenWord = "num";
      char[] a = givenWord.toCharArray();
      int count1 = 0;
      int count2 = 0;

      for(int i=0; i<a.length; i++) {
        if(a[i] == 'a'|| a[i] == 'e'|| a[i] == 'i' ||a[i] == 'o' ||a[i] == 'u' || a[i] == 'A'|| a[i] == 'E'|| a[i] == 'I' ||a[i] == 'O' ||a[i] == 'U'){
           count1++;
        } else {
          count2++;
        }
      }

      System.out.println("TOtal Number of Vowels: " + count1);
      System.out.println("TOtal Number of consonants: " + count2);

    }
  }
