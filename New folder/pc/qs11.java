
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class qs11 {
    public static void main(String[] args) {
      String timeStart = "09:29:58";
      String timeStop = "10:31:48";

      SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

      Date d1 = null;
      Date d2 = null;

      try {
        d1 = format.parse(timeStart);
        d2 = format.parse(timeStop);

        long diff = d2.getTime() - d1.getTime();

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60*1000) % 60;
        long diffHours = diff / (60*60*1000) % 60;

        System.out.print(diffHours + "Hours, ");
        System.out.print(diffMinutes + "Minutes, ");
        System.out.print(diffSeconds + "Seconds. ");
      } catch(Exception e) {
        e.printStackTrace();
      }
    }

  }
