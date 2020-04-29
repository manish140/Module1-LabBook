package assignments6;

import java.io.File;

public class Exercise7 {

	public static void main(String[] args) {
		File f = new File("file.txt");
		boolean a = true;
		a = f.exists();
		if (a == true)
			System.out.println("file exists");
		else
			System.out.println("file doesn't exist");// TODO Auto-generated
		a=f.canRead();
		if(a == true)
			System.out.println("file is readable");
		else
			System.out.println("file is not readable");
		a=f.canWrite();
		if(a==true)
			System.out.println("file is writable");
		else
			System.out.println("file is not writable");
		System.out.println("length of the file "+f.length()+"bytes");
	}

}
