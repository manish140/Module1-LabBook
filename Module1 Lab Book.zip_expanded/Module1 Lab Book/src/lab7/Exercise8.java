package assignments7;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
	int[] modifyArray(int[] a) {
		int i, j, k = 0;
		int[] b = new int[a.length];
		for (i = 0; i < a.length; i++) {
			if (a[i] == 999999)
				continue;
			for (j = i + 1; j < a.length; j++)
				if (a[i] == a[j])
					a[j] = 999999;
			if (a[i] != 999999)
				b[k++] = a[i];
		}
		Arrays.sort(b);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Exercise8 p = new Exercise8();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements");
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter " + n + " elements");
		for (i = 0; i < n; i++)
			a[i] = s.nextInt();
		int[] b = p.modifyArray(a);
		for (i = b.length - 1; i >= 0; i--)
			if (b[i] != 0)
				System.out.println(b[i]);
		s.close();
	}

}
