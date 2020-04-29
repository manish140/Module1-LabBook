package assignments7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	int getSecondSmallest(int[] c) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < c.length; i++) {
			l.add(c[i]);
		}
		Collections.sort(l);
		return l.get(1);

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of elements into array");
		int a = sc.nextInt();
		int[] c = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println("enter the element");
			c[i] = sc.nextInt();
		}
		Exercise5 p = new Exercise5();
		System.out.println("Second Smallest element is :" + p.getSecondSmallest(c));

	}

}
