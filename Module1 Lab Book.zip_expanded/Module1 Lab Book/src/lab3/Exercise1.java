package lab3_exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int num=sc.nextInt();
	int arr[]=new int[num];
	System.out.println("enter the elements");
	for(int i=0;i<num;i++)
		arr[i]=sc.nextInt();
	sc.close();
	System.out.println("second smallest element "+getSecondSmallest(arr));
}
static int getSecondSmallest(int num[]) {
	Arrays.sort(num);
	return num[1];
}
}
