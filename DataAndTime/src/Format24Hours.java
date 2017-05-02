import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Format24Hours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Date date = new Date();
          Calendar cal = Calendar.getInstance();
          
          SimpleDateFormat sdf = new SimpleDateFormat("kk");
          SimpleDateFormat sdf1 = new SimpleDateFormat("ss");
                //kk = Hours in 1-24 format
        	    // hh= hours in 1-12 format
        		// KK= hours in 0-11 format
        		// HH= hours in 0-23 format
          
          System.out.println(sdf.format(date));
          System.out.println(sdf1.format(date));
          System.out.println(cal.WEEK_OF_YEAR);
	}

}
