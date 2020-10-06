import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;

public class CurrentDate {
	
	
	public static void main(String args[])
	{	
	
	
	Calendar calendar=Calendar.getInstance();
	
	SimpleDateFormat test1=new SimpleDateFormat("dd/MM/YYYY");
	String newdate=test1.format(calendar.getTime());
	
	System.out.println(newdate);
	


   
	String arrDate[]=newdate.split("/");
 
   
		int day=Integer.valueOf(arrDate[0]);
		
		System.out.println(day);

}

}