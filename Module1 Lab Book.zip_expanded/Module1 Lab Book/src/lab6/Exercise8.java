package assignments6;

import java.util.Scanner;

public class Exercise8 {
	boolean positive(String s){
		int count =1;
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)<s.charAt(i+1))
				count++;
			else 
				count--;
		}
		if(count==s.length())
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter a string");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Exercise8 p=new Exercise8();
		System.out.println(p.positive(s));

	}

}

