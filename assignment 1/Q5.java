class Q5{
public static void main(String args[]){

System.out.println("Enter first word");
Scanner sc1 = new Scanner();
Char[] char1 = sc1.ToCharArray();

System.out.println("Enter second word");
Scanner sc2 = new Scanner();
Char[] char2 = sc2.ToCharArray();

if(char1==char2){
System.out.println("Same Words");
else
System.out.println("Different Words");
}
}
}