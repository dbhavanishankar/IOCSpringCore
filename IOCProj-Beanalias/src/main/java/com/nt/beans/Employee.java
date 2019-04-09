package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//any stereo type annotations
@Service
public class Employee {

	private Pancard pancard;
	private Salary salary;

	public Employee() {
		System.out.println("Employee.Employee()");
	}

	@Autowired()
	public void setPancard(Pancard pancard) {
		System.out.println("Employee.setPancard()");
		this.pancard = pancard;
	}

	@Autowired()
	public void setSalary(Salary salary) {
		System.out.println("Employee.setSalary()");
		this.salary = salary;
	}
}
