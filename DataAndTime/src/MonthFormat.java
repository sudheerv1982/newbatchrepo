import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MonthFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat  mnth = new SimpleDateFormat();
		SimpleDateFormat  mnth1 = new SimpleDateFormat();
        SimpleDateFormat  mnth2 = new SimpleDateFormat();
        int h = 12;
        if (Calendar.getInstance().get(Calendar.HOUR) == 0)h=12;
        else 
        	Calendar.getInstance().get(Calendar.HOUR);
        System.out.println("String name :" + mnth.format(new Date()) ) ;

		
	}

}
