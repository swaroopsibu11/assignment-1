package com.test.service;

import java.time.LocalDate;
import java.util.Date;

/*@XmlRootElement(name = "Employee")
public class Employee {

	private String id;
	private String name;
	private String dept;

	public Employee() {

		super();
	}

	public Employee(String id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}*/

public class Employee {

	private String id;
	private String name;
	private int salary;
	private LocalDate dateOfJoining; // YYYY-MM-DD

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining
				+ "]";
	}

	public Employee() {
		super();
	}

	public Employee(String id, String name, int salary, LocalDate dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}

}