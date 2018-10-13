/*
 * 
 */
package com.sg.test.util;

import com.sg.test.dto.EmployeeRegistrationDTO;
import com.sg.test.entity.Department;
import com.sg.test.entity.Employee;

/**
 * The Class EmployeeRegistrationUtil.
 */
public class EmployeeRegistrationUtil {

	/**
	 * Convert emp reg DTO to employee.
	 *
	 * @param employeeRegistrationDTO the employee registration DTO
	 * @return the employee
	 */
	public static Employee convertEmpRegDTOToEmployee(EmployeeRegistrationDTO employeeRegistrationDTO){
		Employee employee = new Employee();
		Department department = new Department();
		department.setDepartmentName(employeeRegistrationDTO.getDepartmentName());
		employee.setDob(employeeRegistrationDTO.getDob());
		employee.setFirstName(employeeRegistrationDTO.getFirstName());
		employee.setLastName(employeeRegistrationDTO.getLastName());
		employee.setGender(employeeRegistrationDTO.getGender());
		employee.setDepartment(department);
		return employee;
	}
}
