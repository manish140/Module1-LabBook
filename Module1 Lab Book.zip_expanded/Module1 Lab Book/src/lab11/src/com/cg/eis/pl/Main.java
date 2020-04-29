package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.ServiceClass;

public class Main {
	static ServiceClass s1 = new ServiceClass();
	public static void main(String[] args) {
		int id;
		String name;
		int salary;
		String designation;
		while (true) {
			System.out.println("1.To insert data\n2.to search data\n3.Display all data\n4.exit");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			if (n == 1) {
				System.out.println("enter emp id");
				id = s.nextInt();
				System.out.println("enter emp name");
				name = s.next();
				System.out.println("enter emp salary");
				salary = s.nextInt();
				System.out.println("enter emp des");
				designation = s.next();
				
				s1.addValues(id, name, salary, designation);
			}
			if (n == 2) {
				System.out.println("Enter user id");
				int nid = s.nextInt();
				//ServiceClass s1 = new ServiceClass();
				Employee e = s1.selectData(nid);
				if (e != null)
					System.out.println(e);
				else
					System.out.println("data not found");

			}
			if(n==3) {
				s1.getAllData();
			}
			if (n == 4) {
				System.out.println("thank you");
				System.exit(0);
			}
		}
	}

}
