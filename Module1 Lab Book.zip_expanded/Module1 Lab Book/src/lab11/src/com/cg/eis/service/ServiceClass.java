package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.DaoClass;

public class ServiceClass implements ServiceInterface {
	static DaoClass d = new DaoClass();

	public void addValues(int id, String name, int salary, String designation) {
		// TODO Auto-generated method stub
		String schema = " ";
		if (salary > 5000 && salary < 20000)
			schema = "C";
		if (salary >= 20000 && salary < 40000)
			schema = "B";
		if (salary >= 40000)
			schema = "A";
		if (salary < 5000)
			schema = "no schema";
		Employee e = new Employee(id, name, salary, designation, schema);

		d.add(e);
	}

	public Employee selectData(int nid) {
		// TODO Auto-generated method stub
		System.out.println(" in service class");
		return d.selectData(nid);
	}

	public void getAllData() {

		d.getAllData();
	}

}
