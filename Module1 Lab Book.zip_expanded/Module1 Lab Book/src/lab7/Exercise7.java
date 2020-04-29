package assignments7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise7 {
	int[] getSorted(int a[]) {
		int i;
		String b;
		for (i = 0; i < a.length; i++) {
			b = Integer.toString(a[i]);
			StringBuilder sb = new StringBuilder(b);
			sb.reverse();
			a[i] = Integer.parseInt(sb.toString());
		}
		ArrayList<Integer> list = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		Collections.sort(list);
		int c = list.size();
		for (i = 0; i < c; i++) {
			a[i] = list.get(i).intValue();
		}
		return a;
	}

	public static void main(String[] args) {
		Exercise7 e = new Exercise7();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter no.of elements in array");
		int n = s.nextInt();
		System.out.println("enter elements into array");
		int[] a = new int[n];// TODO Auto-generated method stub
		for (int k = 0; k < n; k++) {
			a[k] = s.nextInt();
		}
		a = e.getSorted(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
