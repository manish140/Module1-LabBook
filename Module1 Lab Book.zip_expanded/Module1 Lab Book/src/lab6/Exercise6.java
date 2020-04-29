package assignments6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) throws IOException {
		System.out.println("enter file name with .txt which has text written");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean b = s.contains(".txt");
		if (b == true) {
			FileReader fr = new FileReader(s);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int count = 0, count1 = 1, a = 0;
			while (line != null) {
				a = a + line.length();
				count++;
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == ' ') {
						count1++;
					}

				}
				line = br.readLine();

			}
			br.close();
			System.out.println("no.of characters " + a);
			System.out.println("no.of words " + (count1 + count - 1));
			System.out.println("no.of lines " + count);
		} else
			System.out.println("enter file name with.txt");

	}

}