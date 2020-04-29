package lab5_exercise1;

import java.util.Scanner;

public class TrafficLight {
public static void main(String[] args) {
	String yellow="ready";
	String red="stop";
	String green="go";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice\n 1.yellow\n2.Red\n3.Green");
	int ch=sc.nextInt();
	sc.close();
	switch(ch) {
	case 1 :
		System.out.println(yellow);
		break;
	case 2:
		System.out.println(red);
		break;
	case 3:
		System.out.println(green);
		break;
	default :
		System.out.println("enter the correct choice");
	}
}
}
