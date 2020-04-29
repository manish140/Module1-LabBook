package assignments6;

import java.util.Scanner;

public class Exercise4 {
	String alterString(String s){
		int n=s.length();
		char[] c=new char[n];
		int i;
		for(i=0;i<s.length();i++){
			c[i]=s.charAt(i);
		}
		for(i=0;i<s.length();i++){
			if(c[i]>='a'&&c[i]<='z'||(c[i]>='A'&&c[i]<='Z')) {
				if(!(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')){
					c[i]=(char) (c[i]+1);
					System.out.print(c[i]);
				}
				else{
					System.out.print(c[i]);
				}}
			else{
				System.out.print(c[i]);
			}}
			
			return s;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.next();
Exercise4 e=new Exercise4();
e.alterString(s);
	
	}

}
