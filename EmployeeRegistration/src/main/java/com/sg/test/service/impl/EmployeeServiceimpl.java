/*
 * 
 */
package com.sg.test.service.impl;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.test.dao.IEmployeeRepository;
import com.sg.test.entity.Employee;
import com.sg.test.exception.BusinessLayerException;
import com.sg.test.service.IEmployeeService;

/**
 * The Class EmployeeServiceimpl.
 */
@Service(value = "IEmployeeService")
public class EmployeeServiceimpl implements IEmployeeService{ 
	
	/** The Log. */
	Logger Log = LoggerFactory.getLogger(EmployeeServiceimpl.class);

	/** The employee repo. */
	@Autowired
	private IEmployeeRepository employeeRepo;
	
	/* (non-Javadoc)
	 * @see com.sg.test.service.IEmployeeService#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees() throws BusinessLayerException{
		return (List<Employee>) employeeRepo.findAll();
	}

	/* (non-Javadoc)
	 * @see com.sg.test.service.IEmployeeService#saveEmployee(com.sg.test.entity.Employee)
	 */
	@Override
	public Employee saveEmployee(Employee employee) throws BusinessLayerException{
		Log.info("Employee object :: "+employee.toString());
		return employeeRepo.save(employee);
	}

}
