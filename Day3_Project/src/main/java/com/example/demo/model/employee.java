package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeetable")
public class employee {
@Id
private int id;
private String name;
private int age;
private Long salary;
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
public employee(int id, String name, int age, Long salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Long getSalary() {
	return salary;
}
public void setSalary(Long salary) {
	this.salary = salary;
}

}
