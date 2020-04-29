package lab5_exercise2;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the postion you want in the fibonacci sequence");
	int pos=sc.nextInt();
	sc.close();
	System.out.println(pos+"th fibonacci num using recursive fun is "+recursiveFibonacci(pos));
	int a = 1, b = 1, c = 0;
	System.out.println(pos+"th fibonacci num with out using recursive fun is ");
	while (pos> 2) {
		c = a + b;
		a = b;
		b = c;
		pos--;
	}
	System.out.println(c);
}
static int recursiveFibonacci(int n) {
	if(n<=2)
		return 1;
	else
	   return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
}

}
