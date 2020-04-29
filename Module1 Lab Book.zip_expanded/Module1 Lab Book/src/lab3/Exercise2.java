package lab3_exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class SortUpperLower {
public static void main(String[] args) {
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	s=sc.next();
	sc.close();
	System.out.println(getSorted(s));
	
}
static String getSorted(String s) {
	int length=s.length();
    char[] ch=s.toCharArray();
	Arrays.sort(ch);
	s=String.valueOf(ch);
	StringBuilder sb=new StringBuilder();
	if(length%2==0)
	   sb.append(s.substring(0,(length/2)).toUpperCase()).append(s.substring(length/2,length));
	else
		sb.append(s.substring(0,(length/2)+1).toUpperCase()).append(s.substring((length/2)+1,length));
	
	s=sb.toString();
	return s;
}
}
