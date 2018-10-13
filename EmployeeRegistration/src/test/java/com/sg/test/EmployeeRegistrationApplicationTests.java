package com.sg.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sg.test.app.EmployeeRegistrationApplication;
import com.sg.test.dao.IEmployeeRepository;
import com.sg.test.entity.Employee;
import com.sg.test.exception.BusinessLayerException;
import com.sg.test.service.impl.EmployeeServiceimpl;

import junit.framework.Assert;

/**
 * The Class EmployeeRegistrationApplicationTests.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeRegistrationApplication.class)
public class EmployeeRegistrationApplicationTests {

	/** The employee list. */
	List<Employee> employeeList = new ArrayList<Employee>();
	
	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		employeeList.add(getEmployee(1l));
		employeeList.add(getEmployee(2l));
	}
	
	/**
	 * Destroy set up.
	 */
	@After
	public void destroySetUp() {
		employeeList = null;
	}
	
	/**
	 * Gets the employee.
	 *
	 * @param id the id
	 * @return the employee
	 */
	private Employee getEmployee(Long id){
		Employee employee = new Employee();
		employee.setEmployeeId(id);
		return employee;
	}
	
	/** The employee repo. */
	@Mock
	private IEmployeeRepository employeeRepo;
	
	/** The employee service. */
	@InjectMocks
	private EmployeeServiceimpl employeeService;
	
	/**
	 * Test get all employees equal.
	 *
	 * @throws BusinessLayerException the business layer exception
	 */
	@Test
	public void testGetAllEmployeesEqual() throws BusinessLayerException {
		Mockito.when(employeeService.getAllEmployees()).thenReturn(employeeList);
		List<Employee> empList = employeeService.getAllEmployees();
		Assert.assertEquals(employeeList, empList);
	}
	
	/**
	 * Test get all employees not null.
	 *
	 * @throws BusinessLayerException the business layer exception
	 */
	@Test
	public void testGetAllEmployeesNotNull() throws BusinessLayerException {
		Mockito.when(employeeService.getAllEmployees()).thenReturn(employeeList);
		List<Employee> empList = employeeService.getAllEmployees();
		Assert.assertNotNull(empList);
	}
	
	/**
	 * Test save employees not null.
	 *
	 * @throws BusinessLayerException the business layer exception
	 */
	@Test
	public void testSaveEmployeesNotNull() throws BusinessLayerException {
		Mockito.when(employeeService.saveEmployee(getEmployee(1l))).thenReturn(getEmployee(1l));
		Employee actualEmployee = employeeService.saveEmployee(getEmployee(1l));
		Assert.assertNotNull(actualEmployee);
	}
	
	/**
	 * Test save employees equals.
	 *
	 * @throws BusinessLayerException the business layer exception
	 */
	@Test
	public void testSaveEmployeesEquals() throws BusinessLayerException {
		Mockito.when(employeeService.saveEmployee(getEmployee(1l))).thenReturn(getEmployee(1l));
		Employee actualEmployee = employeeService.saveEmployee(getEmployee(1l));
		Assert.assertEquals(actualEmployee,getEmployee(1l));
	}

}
