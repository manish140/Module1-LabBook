package lab6_exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineNumber {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	FileReader fr = new FileReader(s);
	BufferedReader br = new BufferedReader(fr);
	String line = br.readLine();
	int i=1;
	while (line != null) {
		System.out.println("line "+ i +":"+line);
		i++;
		line = br.readLine();
		
	}
	br.close();
}
}
