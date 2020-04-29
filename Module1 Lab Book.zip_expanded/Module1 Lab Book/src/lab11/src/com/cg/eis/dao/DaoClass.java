package com.cg.eis.dao;

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public class DaoClass implements DaoInterface {
	static HashMap<Integer, Employee> h = new HashMap<Integer, Employee>();
	public void add(Employee e) {
		
		h.put(e.getId(), e);
		System.out.println("successfully added");
		System.out.println(h.get(e.getId()));
	}

	public Employee selectData(int nid) {
		System.out.println(" in dao class");
		return h.get(nid);
	}

	public void getAllData() {
		
		System.out.println(h);
	}
}
