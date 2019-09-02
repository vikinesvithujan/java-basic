import java.util.Scanner;

public class qs10 {
    public static void main(String[] args) {

      int numOfNames;
      String temp;

      Scanner sa = new Scanner(System.in);
      System.out.print("Enter the Number of Names to Enter: ");
      numOfNames = sa.nextInt();
      String[] names = new String[numOfNames];

      Scanner sat = new Scanner(System.in);
      System.out.print("Enter the all names you need to enter: ");
      for(int i = 0; i < numOfNames; i++) {
        names[i] = sat.nextLine();
      }

      for(int i = 0; i < numOfNames; i++) {
        for(int j = i + 1; j < numOfNames; j++) {
          if (names[i].compareTo(names[j]) > 0) {
            temp = names[i];
            names[i] = names[j];
            names[j] = temp;
          }
        }
      }
      System.out.println("Names in Sorted Order: ");

      for(int i = 0; i < numOfNames - 1; i++) {
        System.out.println(names[i] + ",");
      }
      System.out.println(names[numOfNames-1]);

    }
}
