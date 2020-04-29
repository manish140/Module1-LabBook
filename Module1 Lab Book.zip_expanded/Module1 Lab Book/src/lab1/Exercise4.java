package lab1_exercise4;

import java.util.Scanner;

public class PowerOfTwo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to check");
	int num=sc.nextInt();
	sc.close();
    if(checkNumber(num))
    	System.out.println(num+" is a power of 2");
    else
    	System.out.println(num+" is not a power of 2");
}
static boolean checkNumber(int num) {
	return (num>0&&((num&(num-1))==0));
}
}
