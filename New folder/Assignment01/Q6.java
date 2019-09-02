import java.util.Scanner;

class secoundMax {
	public static void main(String args[]) {
		
		int[] b = {5,9,6,4,7,6,2,2,1};
		
		int n = b.length;  
        int temp = 0;		
		
		for(int i=0; i < n; i++){  
			 for(int j=1; j < (n-i); j++){  
					  if(b[j-1] > b[j]){  
							 //swap elements  
							 temp = b[j-1];  
							 b[j-1] = b[j];  
							 b[j] = temp;  
					 }  
					  
			 }
		}
		
		
		System.out.println("Secound Max Number is: " + b[n-2]);
		
		
	}

}

