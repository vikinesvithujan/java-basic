import javax.lang.model.util.ElementScanner6;

public class qs8.2{
 
    public static void main(String[] args) {
       
        String str = " apple , orange , strawberry , banana ";

         //----------------COUNT THE WORDS------------------------
        int word_count=0;
        for(int i = 0; i < str.length(); i++) {
             if(str.charAt(i)==(',') ) {
                word_count++;
             } 
        }
        //-----------------GET AND STORE THE WORDS IN ARRAY-----------------------
        String [] word;
        word=new String[word_count+1];
        String wo="";
        int count=0;
        for(int i = 0; i < str.length(); i++) { 

            if( str.charAt(i)!=(',')){
                wo=wo+str.charAt(i);
                word[count]=wo; 
            }
            
            else if(str.charAt(i)==(',') ) {
               wo=""; 
                count++;
            }  
            else{
                wo=""; 
                 count++;
            }
            
        //-------------------PRINT THE WORDS---------------------------------    
        }  
        for (String wor : word) {
            System.out.println(wor);  
        }
      
    //-----------------------------USING INBUILD STRING FUNCTION----------------------------//
     
    String[] arr= str.split(",");
   
    for (String wor : arr) {
        System.out.println(wor); 
    }
}
}
