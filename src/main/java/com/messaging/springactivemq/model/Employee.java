package com.messaging.springactivemq.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 4607435115121463243L;

	private Integer id;

	private String name;

	private Double salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee {" + "Id : " + id + ", Name : " + name + ", Salary : " + salary + "}";
	}

}
