import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
public static void main(String[] args) throws ParseException {
	DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date myDate2 = dateFormat2.parse("2010-09-13 22:36:01");
	System.out.println(myDate2);

}
}
