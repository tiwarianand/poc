package com.sg.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sg.test.dto.EmployeeRegistrationDTO;
import com.sg.test.entity.Employee;
import com.sg.test.exception.BusinessLayerException;
import com.sg.test.service.IEmployeeService;
import com.sg.test.util.EmployeeRegistrationUtil;
/**
 * The Class RegistrationController.
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RegistrationController {

	/** The Log. */
	Logger Log = LoggerFactory.getLogger(RegistrationController.class);
	
	/** The employee service. */
	@Autowired
	private IEmployeeService employeeService;
	
	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 */
	@RequestMapping(method = RequestMethod.GET ,value ="/getAllEmployees")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Employee> getAllEmployees(){
		Log.info("Inside getAllEmployees method");
		try {
			return employeeService.getAllEmployees();
		} catch (BusinessLayerException e ) {
			Log.error("Error while fetching the all employees" , e);
		}
		return null;
	}
	
	/**
	 * Save employees.
	 *
	 * @param employeeRegistrationDTO the employee registration DTO
	 */
	@RequestMapping(method = RequestMethod.POST ,value ="/saveEmployee")
	@CrossOrigin(origins = "http://localhost:4200")
	public void saveEmployees(@RequestBody EmployeeRegistrationDTO employeeRegistrationDTO){
		Log.info("Inside saveEmployees method");
		try {
			employeeService.saveEmployee(EmployeeRegistrationUtil.convertEmpRegDTOToEmployee(employeeRegistrationDTO));
		} catch (BusinessLayerException e ) {
			Log.error("Error while saving the employee" , e);
		}
	}
}
