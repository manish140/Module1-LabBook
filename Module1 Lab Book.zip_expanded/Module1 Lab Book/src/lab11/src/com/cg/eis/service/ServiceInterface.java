package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface ServiceInterface {
 public void addValues(int id,String name,int salary,String designation);
	public Employee selectData(int nid);

}
