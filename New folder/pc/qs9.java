import javax.lang.model.util.ElementScanner6;

public class qs9{
 
    public static void main(String[] args) {
       
        String str = " apple  orange strawberry banana ";

         //----------------COUNT THE WORDS------------------------
        int word_count=0;
        for(int i = 0; i < str.length(); i++) {
             if(str.charAt(i)!=(' ') ) {
                System.out.print(str.charAt(i));
             } 
        }
		
	}
}