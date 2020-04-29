package lab1_exercise3;

import java.util.Scanner;

public class IncreasingNumber {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
	sc.close();
	boolean flag=checkNumber(num);
	if(flag)
	 System.out.println(num+" is not an increasing number");
	else
	 System.out.println(num+" is an increasing number");
}
 static boolean checkNumber(int num){
	 int curr_digit;
	 boolean flag = false;
	 curr_digit=num%10;
	 num=num/10;
	 while(num>0) {
		 if(curr_digit<=num%10) {
			 flag=true;
			 break;
		 }
		 curr_digit=num%10;
		 num=num/10;
	 }
	 return flag;
}
}
