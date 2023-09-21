package com.example.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import com.example.mybatis.bean.Employee;

public interface EmployeeMapperAnnotation {
	
	@Select("select * from tbl_employee where id=#{id}")
	public Employee getEmpById(Integer id);
}
