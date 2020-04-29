package assignments6;

import java.util.Scanner;

public class Exercise3 {
	String getImage(String s){
		
		String s2;
		StringBuffer sb=new StringBuffer(s);
		
		s2=sb.reverse().toString();
		System.out.println(s+"|"+s2);
		return s2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.next();
Exercise3 e=new Exercise3();
e.getImage(s);
	}

}
