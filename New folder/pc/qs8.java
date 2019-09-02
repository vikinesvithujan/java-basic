import java.util.Scanner;
import java.util.Arrays;

public class qs8 {
    public static void main(String[] args) {

      String givenWord = " apple , orange , strawberry , banana, Mango";
      String[] singleWord = givenWord.split(",");
      System.out.println(Arrays.toString(singleWord));

    }

}
