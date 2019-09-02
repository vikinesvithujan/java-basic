import java.util.Scanner;

class secoundMax {
	public static void main(String args[]) {
		
		int[] b = {1,1,1,1,2,2,3,4,5,5,6,6};		
		int n = b.length;		
		int[] notRepit = new int[n];
		int[] countArr = new int[n];
        int temp = 0;
		boolean checkValue = false;
		
		int count = 0;

		for(int i=0; i<n; i++) {			
			for(int j=0; j<n; j++){			
				if(b[i] == b[j]) {					
					count = count + 1;
					for(int p=0; p<n; p++) {
						if(notRepit[p] == b[i]) {
							checkValue = true;					
						}						
					}
					if(checkValue != true) {
						notRepit[i] = b[i];
					}	
			}			
			countArr[i] = count;
			count = 0;
		}
		}
		
		for(int k=0; k<n; k++) {
			for(int m=0; m<n; m++) {
				if(notRepit[m] == b[k]) {
					System.out.println(b[k] + "is : " + countArr[k] + " Times");
				}
			}
		}
		
	}
	
	
	

}

