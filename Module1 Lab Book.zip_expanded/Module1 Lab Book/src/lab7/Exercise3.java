package assignments7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Exercise3 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	Map getSquares(int[] c) {
		LinkedHashMap h = new LinkedHashMap();
		List<Integer> allfutures = new ArrayList();
		for (int i = 0; i < c.length; i++) {
			allfutures.add(c[i] * c[i]);
		}
		for (int i = 0; i < c.length; i++) {
			h.put(c[i], allfutures.get(i));

		}
		System.out.println(allfutures);
		Set set1 = h.entrySet();
		Iterator itr1 = set1.iterator();
		System.out.print("{");
		while (itr1.hasNext()) {
			Entry entry = (Entry) itr1.next();
			System.out.print("'" + entry.getKey() + "'" + ":");
			System.out.print(entry.getValue() + ",");
		}
		System.out.print("}");
		return h;

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements into string");
		int a = sc.nextInt();
		int[] c = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println("enter the element");
			c[i] = sc.nextInt();
		}
		Exercise3 p = new Exercise3();
		p.getSquares(c);

	}

}