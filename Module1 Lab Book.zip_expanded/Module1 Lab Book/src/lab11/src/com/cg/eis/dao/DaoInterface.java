package com.cg.eis.dao;

import com.cg.eis.bean.Employee;

public interface DaoInterface {
	public void add(Employee e);
	public Employee selectData(int nid);
}
