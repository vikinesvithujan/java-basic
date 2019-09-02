public class qs13{
 
    public static void main(String[] args) {
        float sum = 0;
        float avarage=0;
        float Variance, SD,  Differ, Varsum=0;
        float sd = 0;
        int[] num = {6,5,9,2,4,6,8,9,2,3};

        for(int i = 0; i < num.length; i++) {
            sum=sum+num[i];
            }
            avarage= sum/10;

            
            for (int i = 0; i < num.length; i++)
            {
                sd += (num[i] - avarage)*(num[i] - avarage) / num.length;
            }
            double standardDeviation = squareRoot(sd);
  
   
    System.out.println("Standart Daviation :"+standardDeviation);


    }  
    public static double squareRoot(Float number) {
        float temp;
    
        float sr = number / 2;
    
        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);
    
        return sr;
        } 
}