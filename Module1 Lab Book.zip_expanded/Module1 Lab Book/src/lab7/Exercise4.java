package assignments7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Exercise4 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	HashMap getStudents(HashMap h) {
		Set set1 = h.entrySet();
		Iterator itr1 = set1.iterator();
		@SuppressWarnings("unused")
		Object o1 = 90, o2 = 80, o3 = 70;
		Object o4 = "Gold", o5 = "Silver", o6 = "Bronze";
		while (itr1.hasNext()) {
			Entry entry = (Entry) itr1.next();
			if (entry.getValue().equals(o1)) {
				h.put(entry.getKey(), o4);
			} else if (entry.getValue().equals(o2)) {
				h.put(entry.getKey(), o5);
			} else
				h.put(entry.getKey(), o6);
		}
		return h;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		HashMap h = new HashMap();
		System.out.println("enter no.of students");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println("enter student registration number");
			String b = sc.next();
			System.out.println("enter student marks");
			int c = sc.nextInt();
			if (c >= 90)
				h.put(b, 90);
			else if (c < 90 && c >= 80)
				h.put(b, 80);
			else
				h.put(b, 70);
		}
		Exercise4 p = new Exercise4();
		System.out.println(p.getStudents(h));

	}

}