package lab1_exercise2;

import java.util.Scanner;

public class FindDifference {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num to calculate the difference");
	int num=sc.nextInt();
	sc.close();
	System.out.println("difference is "+calculateDifference(num));
	
}
static int calculateDifference(int num) {
	int sum=0;
	sum= (int) ((num*(num+1)*(2*num+1))/6-Math.pow(((num*(num+1))/2),2));
	return sum;
}
}
