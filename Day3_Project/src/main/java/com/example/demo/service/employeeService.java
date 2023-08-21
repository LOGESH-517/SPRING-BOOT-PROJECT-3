package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.employee;
import com.example.demo.respository.employeeRepo;

@Service
public class employeeService {
@Autowired
employeeRepo er;
public employee saveinfo(employee ee)
{
	return er.save(ee);
}
public List<employee> showinfo()
{
	return er.findAll();
}
}
