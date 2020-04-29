package lab6_exercise1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s;
	int sum=0,n;
	System.out.println("enter the integers");
	s=sc.nextLine();
	sc.close();
	StringTokenizer st=new StringTokenizer(s," ");
	while (st.hasMoreTokens()) {
        String temp = st.nextToken();
        n = Integer.parseInt(temp);
        System.out.println(n);
        sum = sum + n;
    }
	System.out.println(sum);
}
}
