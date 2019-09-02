import java.util.*;
public class Q3{
	public static void main(String[] args){
		
		char[] letters;
		int i;
		Scanner sc = new Scanner(System.in);
        System.out.print("Input charectors: ");
		
        letters = sc.nextLine().toCharArray();
        System.out.print("Reverse characters: ");
		
        for (i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
	}
	
	
}