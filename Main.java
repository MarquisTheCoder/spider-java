import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final DateFormat full = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


    public static void main(String[] args) throws IOException, InterruptedException{
        System.out.println("Start :");

        while(true) {
            Date date = new Date();
            Process activeWindowProcess = Runtime.getRuntime().exec("xdotool getactivewindow getwindowname");
            java.io.InputStream activeWindowInputStream = activeWindowProcess.getInputStream();
            java.util.Scanner windowScanner = new java.util.Scanner(activeWindowInputStream).useDelimiter("\\A");

            String val = "";
            if (windowScanner.hasNext()) {
                val = windowScanner.next();
            }
            else {
                val = "";
            }

            System.out.print(val +" " + "at:");
            System.out.println(full.format(date));
            TimeUnit.SECONDS.sleep(2);
        }
    }
}