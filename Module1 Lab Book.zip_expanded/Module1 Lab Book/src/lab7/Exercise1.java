package assignments7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
	List<Integer> getValues(HashMap<Integer, Integer> h1) {
		Collection<Integer> values = h1.values();
		ArrayList<Integer> listOfValues = new ArrayList<Integer>(values);
		Collections.sort(listOfValues);
		return listOfValues;

	}

	public static void main(String[] args) {
		Exercise1 p = new Exercise1();
		System.out.println("enter no of elements you want to enter");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (int i = 0; i < a; i++) {
			System.out.println("enter key");
			Integer b = sc.nextInt();
			System.out.println("enter value");
			Integer c = sc.nextInt();
			h.put(b, c);
		}
		System.out.println(p.getValues(h));
	}

}
