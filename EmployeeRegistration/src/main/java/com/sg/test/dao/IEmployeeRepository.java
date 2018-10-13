package com.sg.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sg.test.entity.Employee;

/**
 * The Interface IEmployeeRepository.
 */
@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Integer>{
	
}
