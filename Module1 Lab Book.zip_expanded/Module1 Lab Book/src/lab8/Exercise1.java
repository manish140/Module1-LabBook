package assignments8;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

class CopyDataThread extends Thread
{
	int k,count=0;
	FileInputStream f;
	FileOutputStream f1;
	public CopyDataThread(FileInputStream f) throws Exception {
		FileOutputStream f1=new FileOutputStream("\\e:target.txt");
		this.f1=f1;
		this.f=f;
		}
		public void run()
		{
		try {
			while((k=f.read())!=-1)
			{
				System.out.print((char)k);
				f1.write((char)k);
				count++;
				if(count==10)
				{
					count=0;
					System.out.println("  10 charecters are copied");
					TimeUnit.SECONDS.sleep(5);
				}
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
public class Exercise1 {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter source file");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		FileInputStream f=new FileInputStream(s);

		CopyDataThread c=new CopyDataThread(f);
		c.start();
	}
}
