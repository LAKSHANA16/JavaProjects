package com.service;

import java.util.List;

import com.exception.ResourceNotFoundException;
import com.model.Employee;

public class EmployeeService {
public Employee getEmployeeById(List<Employee> list,int id)
		throws ResourceNotFoundException//throwing exception
{
	for(Employee e :list)
	{
		if(e.getId()==id)
		return e;
	}
	throw new ResourceNotFoundException("Invalid id");//declaring exception
}

}
