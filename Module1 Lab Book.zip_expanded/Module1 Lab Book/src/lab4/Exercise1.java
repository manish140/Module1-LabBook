package lab4_exercise1;

import java.util.Scanner;

public class SumOfCubes {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
	sc.close();
	System.out.println("sum of cubes of digits of num "+sumOfCubes(num));
}
static int sumOfCubes(int num) {
	int sum=0,rem=0;
	while(num>0) {
	  rem=num%10;
	  num=num/10;
	  sum=(int) (sum+Math.pow(rem,3));
	}
	return sum;	
}
}
