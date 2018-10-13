package com.sg.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The Class Department.
 */
@Entity
@Table(name = "Department" , schema ="Registration")
public class Department implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1540642214441781048L;

	/** The department id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Department_Id")
	private Long departmentId;
	
	/** The department name. */
	@Column(name ="Name")
	private String departmentName;

	/**
	 * Gets the department id.
	 *
	 * @return the department id
	 */
	public Long getDepartmentId() {
		return departmentId;
	}

	/**
	 * Sets the department id.
	 *
	 * @param departmentId the new department id
	 */
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * Gets the department name.
	 *
	 * @return the department name
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * Sets the department name.
	 *
	 * @param departmentName the new department name
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + "]";
	}
	
	
}
