public class q12 {
    public static void main(String[] args) {

int sY=2014;
int sM=10;
int sD=25;
int eY=2018;
int eM=5;
int eD=14;
int calStart=((sY*365)+(sM*30)+sD);
int calEnd=((eY*365)+(eM*30)+eD);
int intervel=(calEnd-calStart);
System.out.println((intervel/365)+"Y"+":"+((intervel%60)/30)+"M"+":"+((intervel%60)%30)+"D");
System.out.println("No of days : "+intervel);

    }

  }
