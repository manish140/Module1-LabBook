package assignmentss10;
import java.util.Scanner;

interface I
{
	int power(int a,int b);
}
public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		I pow_fun=(int a,int b)->(int)Math.pow(a, b);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(pow_fun.power(a, b));
	}
}
