package Inheritance;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date d=new Date();
		Calendar cal=Calendar.getInstance();
		
		SimpleDateFormat d1=new SimpleDateFormat("M/dd/yyyy");  // to display date in different format
//System.out.println(d.toString());
System.out.println(d1.format(cal.getTime()));
System.out.println(cal.get(Calendar.DAY_OF_WEEK));

	}

}
