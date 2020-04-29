package assignments7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Exercise6 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	List votersList(HashMap h) {
		HashMap h1 = new HashMap();
		Set set1 = h.entrySet();
		Iterator itr1 = set1.iterator();
		while (itr1.hasNext()) {
			Entry entry = (Entry) itr1.next();
			int b = (int) entry.getValue();
			if (b > 18)
				h1.put(entry.getKey(), b);
		}
		Set<Entry<Integer, Integer>> entrySet = h1.entrySet();
		ArrayList<Entry<Integer, Integer>> listOfEntry = new ArrayList<Entry<Integer, Integer>>(entrySet);
		return listOfEntry;
	}

	@SuppressWarnings({ "rawtypes", "unchecked","resource" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap h = new HashMap();
		System.out.println("enter no.of people");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println("enter id");
			String b = sc.next();
			System.out.println("enter age");
			int c = sc.nextInt();
			h.put(b, c);
		}
		Exercise6 p = new Exercise6();
		System.out.println(p.votersList(h));

	}

}
