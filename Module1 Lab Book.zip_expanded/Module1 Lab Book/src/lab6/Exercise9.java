package assignments6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		System.out.println("enter the current date");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("enter the last date");
		String s1=sc.next();
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yy");
		Date d1 = null;
	    Date d2 = null;
	    try {
	        d1 = sd.parse(s);
	        d2 = sd.parse(s1);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    long diff = d2.getTime() - d1.getTime();
	    long diffDays = diff / (24 * 60 * 60 * 1000);
	    long diffMonth = diffDays/30;
	    long diffYears = diffMonth/12;
        System.out.println("Time in days: " + diffDays + " days");
	    System.out.println("Time in months: " + diffMonth+ " months");
	    System.out.println("Time in years: " + diffYears + " years");

	}

}