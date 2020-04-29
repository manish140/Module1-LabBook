package assignments9;
import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import java.util.concurrent.TimeUnit;
public class Copy10Characters {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter source file");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		FileInputStream f=new FileInputStream(s);
		FileOutputStream f1=new FileOutputStream("e:\\target1.txt");
		ExecutorService es=Executors.newFixedThreadPool(5);
		Runnable r=()->{
			int k=0,count=0;
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
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}};
	es.execute(r);
}
}
