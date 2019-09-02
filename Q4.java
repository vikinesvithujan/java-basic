import java.util.*;
 
class Q4
{
   public static void main(String args[])
   {
      String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in);
     
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
     
      int  i, length; 
	  length = original.length();
     
      for ( i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
         
      if (original.equals(reverse))
         System.out.println("The string is a palindrome.");
      else
         System.out.println("The string isn't a palindrome.");
         
   }
}      