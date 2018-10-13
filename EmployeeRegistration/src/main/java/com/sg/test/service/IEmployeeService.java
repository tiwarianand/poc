/*
 * 
 */
package com.sg.test.service;

import java.util.List;

import com.sg.test.dto.EmployeeRegistrationDTO;
import com.sg.test.entity.Employee;
import com.sg.test.exception.BusinessLayerException;

/**
 * The Interface IEmployeeService.
 */
public interface IEmployeeService {

	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 * @throws BusinessLayerException the business layer exception
	 */
	public List<Employee> getAllEmployees() throws BusinessLayerException;
	
	/**
	 * Save employee.
	 *
	 * @param employee the employee
	 * @return the employee
	 * @throws BusinessLayerException the business layer exception
	 */
	public Employee saveEmployee(Employee employee) throws BusinessLayerException;
}
