package lab1_exercise1;

import java.util.Scanner;

public class SumOf_3n_5n {
	 static int calculateSum(int num) {
		 int i=1,sum=0;
		 /*calculate sum of numbers that are
		  * divisible by 3 or 5
		  */
		 while(i<=num) {
		 if(i%3==0||i%5==0) {
			 sum=sum+i;
		 }
		 i++;
		 }
			return sum;
	}
public static void main(String[] args) {
	int num,sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	sc.close();
	sum=calculateSum(num);
	System.out.println("Sum of n natural numbers that are divisible by 3 or 5 is "+sum);
	}
}
