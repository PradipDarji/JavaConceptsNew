package BasicJavaConcept;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        Format formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String s = formatter.format(new Date());
        System.out.println(s);
    }
}
