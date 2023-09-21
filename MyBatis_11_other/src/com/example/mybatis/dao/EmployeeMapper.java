package com.example.mybatis.dao;

import java.util.List;

import com.example.mybatis.bean.Employee;
import com.example.mybatis.bean.OraclePage;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getEmps();
	
	public Long addEmp(Employee employee);
	
	public void getPageByProcedure(OraclePage page);
}
