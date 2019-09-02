public class q11 {
    public static void main(String[] args) {

int sH=14;
int sM=10;
int eH=18;
int eM=20;
int calStart=((sH*60)+sM);
int calEnd=((eH*60)+eM);
int intervel=(calEnd-calStart);
System.out.println((intervel/60)+":"+intervel%60);

    }

  }
