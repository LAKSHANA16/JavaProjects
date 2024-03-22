package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.exception.ResourceNotFoundException;
import com.model.Employee;
import com.service.EmployeeService;

import junit.framework.Assert;

public class EmployeeTest {

	EmployeeService employeeService = new EmployeeService();

	@Test
	public void getEmployeeByIdTest() throws ResourceNotFoundException {
		/* case 1: valid id */
		Employee e1 = new Employee(1, "aadhya", 80000, "IT");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		int id = 1;//can use try catch
		Employee expectedOutput = new Employee(1, "aadhya", 80000, "IT");
		Assert.assertEquals(expectedOutput, employeeService.getEmployeeById(list, id));
		
		/*case 2:*/
		id = 5;
		Employee expectedOutput1 = new Employee(1, "aadhya", 80000, "IT");
		try
		{
		Assert.assertEquals(expectedOutput1, employeeService.getEmployeeById(list, id));
		}
		catch(ResourceNotFoundException e)
		{
			Assert.assertEquals("Invalid Id".toLowerCase(),e.getMessage().toLowerCase());
		}
	}
}
